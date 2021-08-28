package com.appdeveloperblog.photoapp.api.users.api_users.service;

import com.appdeveloperblog.photoapp.api.users.api_users.shared.UserDto;

public interface UserService {

    UserDto createUser(UserDto userDetails);
    
}
