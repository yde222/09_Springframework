package com.ohgiraffers.springsecurity.query.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserListResponse {
    private List<UserDto> users;
}
