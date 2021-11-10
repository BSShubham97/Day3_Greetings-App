package com.bridgelabz.mygreetingapp.controller;

import com.bridgelabz.mygreetingapp.dto.UserDto;
import com.bridgelabz.mygreetingapp.model.User;
import com.bridgelabz.mygreetingapp.service.GreetingService;
import com.bridgelabz.mygreetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value={"/", " "})
    public String getWelcomeMessage() {
        return greetingService.getHelloMessage();
    }
    @GetMapping("/customMessage")
    public String getCustomMessage(@RequestBody UserDto userDto) {
        return greetingService.getCustomMessage(userDto);
    }
    @GetMapping("/find_greeting")
    public User findGreetById(@RequestParam int id) {
        return greetingService.getGreetById(id);
    }
}

