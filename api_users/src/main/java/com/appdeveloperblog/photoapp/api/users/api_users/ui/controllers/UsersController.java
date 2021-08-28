package com.appdeveloperblog.photoapp.api.users.api_users.ui.controllers;

import com.appdeveloperblog.photoapp.api.users.api_users.service.UserService;
import com.appdeveloperblog.photoapp.api.users.api_users.shared.UserDto;
import com.appdeveloperblog.photoapp.api.users.api_users.ui.models.CreateUserRequestModel;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment env;

    @Autowired
    UserService userService;

    @GetMapping("/status/check")
    public String status() {
        return "working";
    }

    @PostMapping
    public String createUser(@RequestBody CreateUserRequestModel userDetails) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(userDetails, UserDto.class);
        userService.createUser(userDto);
        
        return "Post user";
    }
}
