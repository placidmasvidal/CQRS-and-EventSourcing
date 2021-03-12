package com.placidmasvidal.cqrsandeventsourcing.command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.placidmasvidal.cqrsandeventsourcing")
public class CommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class, args);
    }
}