package com.jjh.chap06filterlecturesource.section02.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class RequestWrapper extends HttpServletRequestWrapper {
    /***
     * HttpServletRequestWrapper에는 기본 생성자가 존재하지 않기 때문에
     * 반드시 원래의 HttpServletRequest를 매개변수로 전달받는 생성자를 구현
     */
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    /* 비밀번호와 관련된 속성 파라미터를 꺼낼 때 암호화를 적용할 확장된 메소드 */
    @Override
    public String getParameter(String name) {
        String value = "";

        if ("password".equals(name)) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            value = encoder.encode(super.getParameter(name));
        } else {
            value = super.getParameter(name);
        }

        return value;
    }
}
