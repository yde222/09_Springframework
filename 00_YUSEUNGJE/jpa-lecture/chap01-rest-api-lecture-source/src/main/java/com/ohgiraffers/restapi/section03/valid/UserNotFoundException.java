package com.ohgiraffers.restapi.section03.valid;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
