package com.zzr.producer.controller;

import com.zzr.producer.dao.UserRepository;
import com.zzr.producer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id){
        User findOne = userRepository.findOne(id);
        return findOne;
    }
}
