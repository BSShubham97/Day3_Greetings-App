package com.bridgelabz.mygreetingapp.service;

import com.bridgelabz.mygreetingapp.dto.UserDto;
import com.bridgelabz.mygreetingapp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IGreetingService {
    public String getHelloMessage();
    public String getCustomMessage(UserDto userDto) ;
    public User getGreetById(int id);
    public List<User> getAllMessage();
    public String deleteGreet(int id);
    public User updateMessage(int id, UserDto userDto);

}