package com.preproute.preproute.controller;


import com.preproute.preproute.dto.CommonResponse;
import com.preproute.preproute.dto.LoginDTO;
import com.preproute.preproute.dto.UsersDTO;
import com.preproute.preproute.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService userService;

    @PostMapping("/register")
    public CommonResponse register(@RequestBody UsersDTO userDTO) {
        return userService.registerUser(userDTO);
    }
    
    
    @PostMapping("/login")
    public CommonResponse login(@RequestBody LoginDTO loginDTO) {
        return userService.loginUser(loginDTO);
    }

}
