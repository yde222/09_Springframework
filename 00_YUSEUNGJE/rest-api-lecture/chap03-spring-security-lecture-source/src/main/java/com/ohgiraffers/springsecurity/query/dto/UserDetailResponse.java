package com.ohgiraffers.springsecurity.query.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDetailResponse {
    private UserDto user;
}
