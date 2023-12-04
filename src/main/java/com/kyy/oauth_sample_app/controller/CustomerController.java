package com.kyy.oauth_sample_app.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
