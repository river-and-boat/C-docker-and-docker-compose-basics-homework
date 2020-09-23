package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private final RestTemplate restTemplate;

    private final static String HOST_BOB = "http://127.0.0.1:8081/hello";

    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String getHelloWorld() {
        return restTemplate.getForObject(HOST_BOB, String.class);
    }
}
