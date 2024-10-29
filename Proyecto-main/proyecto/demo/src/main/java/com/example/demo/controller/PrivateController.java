package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class PrivateController {
    
    @GetMapping("/")
    @PreAuthorize("hasRole('ESTUDIANTE')")
    public String estudiante(){
        return "Estudiante";
    }
}
