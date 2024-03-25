package com.springboot.supermarket.Service;

import com.springboot.supermarket.Dto.LoginDto;
import com.springboot.supermarket.Dto.UserDTO;
import com.springboot.supermarket.response.LoginResponse;

public interface UserService {
    
    String addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDto loginDTO);
}
