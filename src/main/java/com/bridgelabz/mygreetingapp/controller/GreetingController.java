package com.bridgelabz.mygreetingapp.controller;

import com.bridgelabz.mygreetingapp.dto.UserDto;
import com.bridgelabz.mygreetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping(value={"/", " "})
    public String getWelcomeMessage() {
        return greetingService.getHelloMessage();
    }
    @GetMapping("/customMessage")
    public String getCustomMessage(@RequestBody UserDto userDto) {
        return greetingService.getCustomMessage(userDto);
    }
}

