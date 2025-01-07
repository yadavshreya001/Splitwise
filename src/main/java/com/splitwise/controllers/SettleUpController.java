package com.splitwise.controllers;

//http://localhost:8080/settleup/

import com.splitwise.dtos.SettleUpGroupRequestDto;
import com.splitwise.dtos.SettleUpGroupResponseDto;
import com.splitwise.dtos.SettleUpUserRequestDto;
import com.splitwise.dtos.SettleUpUserResponseDto;
import com.splitwise.services.SettleUpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/settleUp")
public class SettleUpController {
    private SettleUpService settleUpService;

    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto requestDto) {
        return null;
    }

    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto requestDto) {
        return null;
    }
}