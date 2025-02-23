package com.spring.greetingapp;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public Map<String, String> getGreeting() {
        return Map.of("message", "Hello World");
    }

    @PostMapping
    public Map<String, String> postGreeting() {
        return Map.of("message", "POST request received");
    }

    @PutMapping
    public Map<String, String> putGreeting() {
        return Map.of("message", "PUT request received");
    }

    @DeleteMapping
    public Map<String, String> deleteGreeting() {
        return Map.of("message", "DELETE request received");
    }
}