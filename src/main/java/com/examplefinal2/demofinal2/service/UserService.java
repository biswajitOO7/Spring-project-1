package com.examplefinal2.demofinal2.service;


import com.examplefinal2.demofinal2.model.User;
import com.examplefinal2.demofinal2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired

    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
