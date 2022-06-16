package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, World!";

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(String.format(template));
    }
}
