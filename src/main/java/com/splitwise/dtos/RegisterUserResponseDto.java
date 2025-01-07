package com.splitwise.dtos;

import com.splitwise.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserResponseDto {
    private User user;
}