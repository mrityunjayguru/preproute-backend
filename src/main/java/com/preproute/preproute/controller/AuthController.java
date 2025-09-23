package com.preproute.preproute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/api/login")
    public String login() {
        return "login"; // returns login.html from /templates
    }
}