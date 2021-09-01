package com.appdeveloperblog.photoapp.api.users.api_users.service;

import com.appdeveloperblog.photoapp.api.users.api_users.shared.UserDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    UserDto createUser(UserDto userDetails);
    UserDto getUserDetailsByEmail(String email);
    
}
