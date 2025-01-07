package com.splitwise.commands;

import com.splitwise.controllers.UserController;
import com.splitwise.dtos.RegisterUserRequestDto;
import com.splitwise.dtos.RegisterUserResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegisterUserCommand implements Command {
    private UserController userController;
    //Register vinsmokesanji 003 namisswwaann

    public RegisterUserCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(" ")); // Register, vinsmokesanji, 003, namisswwaann

        return words.size() == 4 && words.get(0).equals(CommandKeywords.registerCommand);
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));

        RegisterUserRequestDto requestDto = new RegisterUserRequestDto();

        requestDto.setUsername(words.get(1));
        requestDto.setPhoneNumber(words.get(2));
        requestDto.setPassword(words.get(3));

        RegisterUserResponseDto responseDto = userController.registerUser(requestDto);
    }
}