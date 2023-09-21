package com.example.demosv.DTO;

import lombok.Data;

import java.util.List;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;

    private List<String> roles;
}