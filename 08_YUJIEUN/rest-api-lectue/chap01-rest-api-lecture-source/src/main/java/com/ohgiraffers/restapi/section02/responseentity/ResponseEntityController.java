package com.ohgiraffers.restapi.section02.responseentity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entity")
public class ResponseEntityController {

    private List<UserDTO> users;

    public  ResponseEntityController(){
        users = new ArrayList<>();
        users.add(new UserDTO(1, "user01", "pass01", "유관순"));
        users.add(new UserDTO(2, "user02", "pass02", "홍길동"));
        users.add(new UserDTO(3, "user03", "pass03", "이순신"));
    }

    @GetMapping("/users")
    public ResponseEntity<ResponseMessage> findAllUsers(){

        /*응답 헤더 설정 : JSON 응답이 default 이거나 하나 변경이 필요한 경우 HttpHeader 설정 변경*/
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(
                new MediaType("application","json", StandardCharsets.UTF_8)
        );

        /* 응답 바디 설정 */
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("users", users);

        /* 응답 메세지 설정 */
        ResponseMessage responseMessage =  new ResponseMessage(
                200,"조회 성공", responseMap
        );


        return new ResponseEntity<>(responseMessage, httpHeaders, HttpStatus.OK);

    }

    @GetMapping("/users/{userNo}")
    public ResponseEntity<ResponseMessage> findUserByNo(@PathVariable int userNo) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(
                new MediaType("application", "json", Charset.forName("UTF-8"))
        );

        UserDTO foundUser = users.stream()
                .filter(user -> user.getNo() == userNo)
                .collect(Collectors.toList()).get(0);
        System.out.println(foundUser);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("user", foundUser);

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(new ResponseMessage(200, "조회 성공", responseMap));
    }

    @PostMapping("/users")
    public ResponseEntity<ResponseMessage> registUser(@RequestBody UserDTO userDTO){
        int lastUserNo = users.get(users.size() - 1).getNo();
        userDTO.setNo(lastUserNo +1);
        users.add(userDTO);

        return ResponseEntity
                .created(URI.create("/entity/users" + users.get(users.size() - 1).getNo()))
                .build();
    }

    @PostMapping("/users/{userNo}")
    public ResponseEntity<Void> modifyUser(@PathVariable int userNo, @RequestBody UserDTO userDTO){
        UserDTO foundUser = users.stream().filter(user -> user.getNo() == userNo).findFirst().get();
        foundUser.setPwd(userDTO.getPwd());
        foundUser.setName(userDTO.getName());

        return ResponseEntity.created(URI.create("/entity/users/" + userNo))
                .build();
    }


    @DeleteMapping("/users/{userNo}")
    public ResponseEntity<?> removeUser(@PathVariable int userNo) {

        UserDTO foundUser
                = users.stream().filter(user -> user.getNo() == userNo)
                .collect(Collectors.toList()).get(0);

        users.remove(foundUser);

        return ResponseEntity
                .noContent()
                .build();
    }
}
