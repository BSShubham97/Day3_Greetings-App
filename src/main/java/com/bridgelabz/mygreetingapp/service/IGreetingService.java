package com.bridgelabz.mygreetingapp.service;

import com.bridgelabz.mygreetingapp.dto.UserDto;
import com.bridgelabz.mygreetingapp.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IGreetingService {
    public String getHelloMessage();
    public String getCustomMessage(UserDto userDto) ;
    public User getGreetById(int id);
}