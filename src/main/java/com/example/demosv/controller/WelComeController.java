package com.example.demosv.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class WelComeController {

    @GetMapping("/view")
    public String viewprofile(HttpServletRequest request) {
        String username = request.getUserPrincipal().getName();
        return username;
    }
}