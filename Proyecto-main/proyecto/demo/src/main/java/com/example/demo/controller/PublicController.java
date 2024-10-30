package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicController {

    @PostMapping(value = "login")
    public String login() {
        return "public";
    }

    @GetMapping("/home")
    public String home(){
        return "index";
    }
    
    @PostMapping(value = "register")
    public String register(){
        return "register";
    }

}