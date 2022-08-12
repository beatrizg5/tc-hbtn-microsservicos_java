package com.example.user.exception;

public class UserIdException extends RuntimeException {
    public UserIdException() {
        super(String.valueOf(id));
    }
}
