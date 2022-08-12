package com.example.user.exception;

public class UserNameException extends RuntimeException {
    public UserNameException() {
        super(userName);
    }
}