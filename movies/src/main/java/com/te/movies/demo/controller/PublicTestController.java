package com.te.movies.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicTestController {

    @GetMapping("/public")
    public String homePage() {
        return "Hello from Spring boot app";
    }

}