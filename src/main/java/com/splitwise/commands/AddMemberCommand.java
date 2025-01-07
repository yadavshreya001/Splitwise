package com.splitwise.commands;

import com.splitwise.controllers.UserController;
import com.splitwise.dtos.AddMemberRequestDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddMemberCommand implements Command {
    //u1 AddMember g1 u2
    private UserController userController;

    public AddMemberCommand(UserController userController) {
        this.userController = userController;
    }

    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(" "));

        return words.size() == 4 && words.get(1).equals(CommandKeywords.addMemberCommand);
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));

        Long admin = Long.valueOf(words.get(0));
        Long groupId = Long.valueOf(words.get(2));
        Long userId = Long.valueOf(words.get(3));

        AddMemberRequestDto requestDto = new AddMemberRequestDto();
        requestDto.setUserId(userId);
        requestDto.setAdminId(admin);
        requestDto.setGroupId(groupId);

        userController.addMember(requestDto);
    }
}
