package com.splitwise;

import com.splitwise.commands.CommandExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Waiting for user input.....");
            String input = scanner.nextLine();
            CommandExecutor.execute(input);
        }
    }

}
