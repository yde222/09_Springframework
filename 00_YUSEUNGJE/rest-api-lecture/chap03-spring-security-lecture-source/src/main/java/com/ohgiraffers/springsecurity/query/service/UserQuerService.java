package com.ohgiraffers.springsecurity.query.service;

import com.ohgiraffers.springsecurity.query.dto.UserDetailResponse;
import com.ohgiraffers.springsecurity.query.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserQuerService {

    private final UserMapper userMapper;

    public UserDetailResponse getUserDetail(String username) {
        return null;
    }
}
