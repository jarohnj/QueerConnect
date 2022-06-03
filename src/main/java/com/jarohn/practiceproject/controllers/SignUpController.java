package com.jarohn.practiceproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("signup")
public class SignUpController {

    @GetMapping
    public String displaySignUpForm() {
        return "signup";
    }

    @PostMapping
    public String processSignUpForm() {
        return "redirect: /profile";
    }
}
