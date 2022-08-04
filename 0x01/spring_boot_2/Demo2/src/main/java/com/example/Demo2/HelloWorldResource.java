package com.example.Demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;

@RestController
@RequestMapping(value="/messages")
public class HelloWorldResource {
    public PrintStream home(){
        return System.out.printf("PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!!");
    }
}
