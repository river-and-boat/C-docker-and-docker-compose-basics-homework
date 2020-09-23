package com.thoughtworks.capability.gtb.bob.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String RETURN_VALUE = "Hello from Bob!";

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String getFromBob() {
        return RETURN_VALUE;
    }
}
