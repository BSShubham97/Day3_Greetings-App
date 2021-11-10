package com.bridgelabz.mygreetingapp.service;

import com.bridgelabz.mygreetingapp.dto.UserDto;
import com.bridgelabz.mygreetingapp.model.User;
import com.bridgelabz.mygreetingapp.repository.IGreetingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Autowired
    private IGreetingRepository iGreetingRepository;

    public String getHelloMessage() {
        return "Hello I am Shubham";
    }
    public String getCustomMessage(UserDto userDto) {
        User user = new User();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(userDto, user);
        iGreetingRepository.save(user);
        return ("Hello how are you " + user.getFirstName() + " " + user.getLastName());
    }

}
