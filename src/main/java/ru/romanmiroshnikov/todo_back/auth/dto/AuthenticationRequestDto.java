package ru.romanmiroshnikov.todo_back.auth.dto;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}
