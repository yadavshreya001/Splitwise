package com.splitwise.controllers;

import com.splitwise.dtos.AddMemberRequestDto;
import com.splitwise.dtos.RegisterUserRequestDto;
import com.splitwise.dtos.RegisterUserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    public RegisterUserResponseDto registerUser(RegisterUserRequestDto requestDto) {
        System.out.println("Register user command");
        return null;
    }

    public ResponseEntity<Void> addMember(AddMemberRequestDto requestDto) {
        return null;
    }
}