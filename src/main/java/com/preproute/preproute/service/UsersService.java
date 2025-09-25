package com.preproute.preproute.service;


import com.preproute.preproute.dto.UsersDTO;
import com.preproute.preproute.jwtutil.JwtUtil;
import com.preproute.preproute.dto.LoginDTO;
import com.preproute.preproute.model.Users;
import com.preproute.preproute.repository.UsersRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository userRepository;
    
    
    @Autowired
    JwtUtil jwtUtil;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String registerUser(UsersDTO usersDTO) {
        if (userRepository.existsByUsername(usersDTO.getUsername())) {
            return "Username already exists";
        }

        String encryptedPassword = passwordEncoder.encode(usersDTO.getPassword());

        Users user = new Users();
        user.setUsername(usersDTO.getUsername());
        user.setPassword(encryptedPassword);
        user.setEmail(usersDTO.getEmail());
        user.setPhone(usersDTO.getPhone());
        user.setRole(usersDTO.getRole());
        
        

        userRepository.save(user);
        return "User registered successfully";
    }
    
    
    
    
    public String loginUser(LoginDTO loginDTO) {
        Optional<Users> optionalUser = userRepository.findByUsername(loginDTO.getUsername());

        if (optionalUser.isEmpty()) {
            return "User not found";
        }

        Users user = optionalUser.get();

        boolean passwordMatch = passwordEncoder.matches(
            loginDTO.getPassword(), user.getPassword()
        );

        if (passwordMatch) {
        	 String token = jwtUtil.generateToken(user.getUsername());
             return token;
        } else {
            return "Invalid credentials";
        }
    }

    
    
    
    
}
