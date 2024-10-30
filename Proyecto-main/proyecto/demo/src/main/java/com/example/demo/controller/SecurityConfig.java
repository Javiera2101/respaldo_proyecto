package com.example.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity 
@RequiredArgsConstructor
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> 
                csrf.disable())
            .authorizeHttpRequests(authRequest -> 
                authRequest
                .requestMatchers("/", "/index", "/home", "/public/**", "/login").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(formLogin -> 
                formLogin
                    .loginPage("/login") // Especifica la página de login personalizada
                    .permitAll()
            )
            .build();
    }
}