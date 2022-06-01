package com.jarohn.practiceproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("add-profile")
public class ProfileController {

    @GetMapping
    public String displayProfileForm() {
        return "profile";
    }
}
