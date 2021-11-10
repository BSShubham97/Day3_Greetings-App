package com.bridgelabz.mygreetingapp.service;

import com.bridgelabz.mygreetingapp.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface IGreetingService {
    public String getHelloMessage();

    public String getCustomMessage(UserDto userDto) ;
}