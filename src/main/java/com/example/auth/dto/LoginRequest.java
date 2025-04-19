package com.example.auth.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class LoginRequest {
    private String username;
    private String password;
}

