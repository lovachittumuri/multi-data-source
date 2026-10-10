package com.demo.multi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.multi.user.model.User;
import com.demo.multi.user.repository.UserJpaRepository;

@RestController
@RequestMapping("user")
public class UserController {


    private UserJpaRepository userJpaRepository;

    public UserController(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @GetMapping(path = "{userId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public User getUserDetail(@PathVariable("userId") Long userId) {
        return userJpaRepository.findById(userId).orElse(null);
    }
}