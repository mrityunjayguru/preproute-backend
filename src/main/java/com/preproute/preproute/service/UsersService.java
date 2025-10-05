package com.preproute.preproute.service;


import com.preproute.preproute.dto.UsersDTO;

import com.preproute.preproute.dto.CommonResponse;
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
    
    
   
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public CommonResponse registerUser(UsersDTO usersDTO) {
        if (userRepository.existsByUsername(usersDTO.getUsername())) {
        	
        	
        	 Optional<Users> optionalUser = userRepository.findByUsername(usersDTO.getUsername());

                 Users user = optionalUser.get();

            // Optionally check if password has changed
           /* if (!passwordEncoder.matches(usersDTO.getPassword(), user.getPassword())) {
                user.setPassword(passwordEncoder.encode(usersDTO.getPassword()));
            }
            */
            

            user.setUsername(usersDTO.getUsername());
            
            user.setEmail(usersDTO.getEmail());
            user.setPhone(usersDTO.getPhone());
            user.setRole(usersDTO.getRole());
            user.setExam(usersDTO.getExam());
            user.setFirstname(usersDTO.getFirstname());
            user.setLastname(usersDTO.getLastname());
            user.setName(usersDTO.getName()); 
            user.setStep(usersDTO.getStep());
            user.setStream(usersDTO.getStream());
            user.setYear(usersDTO.getYear());
            
            user.setUsertype(usersDTO.getUsertype());
            user.setSource(usersDTO.getSource());
            
            user.setDelflag(usersDTO.getDelflag() );
            
            userRepository.save(user);
            

            user.setConfirmpassword(null);
            user.setPassword(null);
            
            
            return new CommonResponse("User updated successfully", 200, null, user);
            
            
        	
            
        }

        String encryptedPassword = passwordEncoder.encode(usersDTO.getPassword());

        Users user = new Users();
        user.setUsername(usersDTO.getUsername());
        user.setPassword(encryptedPassword);
        user.setConfirmpassword(encryptedPassword);
        
        user.setEmail(usersDTO.getEmail());
        user.setPhone(usersDTO.getPhone());
        user.setRole(usersDTO.getRole());
        
        user.setExam(usersDTO.getExam());
        user.setFirstname(usersDTO.getFirstname());
        user.setLastname(usersDTO.getLastname());
        user.setName(usersDTO.getName()); 
        user.setStep(usersDTO.getStep());
        user.setStream(usersDTO.getStream());
        user.setYear(usersDTO.getYear());
        
        user.setUsertype(usersDTO.getUsertype());
        user.setSource(usersDTO.getSource());
               
        

        userRepository.save(user);
        
        user.setConfirmpassword(null);
        user.setPassword(null);
        
        
        return new CommonResponse("User registered successfully", 200, null, user);
        
    }
    
    
    
   
    public CommonResponse loginUser(LoginDTO loginDTO) {
        Optional<Users> optionalUser = userRepository.findByUsername(loginDTO.getUsername());

        if (optionalUser.isEmpty()) {
            return new CommonResponse("User not found", 404, null, null);
        }

        Users user = optionalUser.get();

        boolean passwordMatch = passwordEncoder.matches(
            loginDTO.getPassword(), user.getPassword()
        );

        if (passwordMatch && user.getDelflag().equals("N")) {
        	 String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuaXJhamFkbWluIn0.k7KLMPh_wFPDhUOm3rE--dpUz50piu2g8HRA20Z93Ys1csalesqXjdArjLDB-xUOfTf__NAVqHStbT6-4Zwaag";
            user.setConfirmpassword(null);
            user.setPassword(null);
            return new CommonResponse("Login successful", 200, token, user);
        } else {
             return new CommonResponse("Invalid credentials", 401, null, null);
        }
    }

    
    
    
    public CommonResponse loginUsernn(LoginDTO loginDTO) {
        Optional<Users> optionalUser = userRepository.findByUsername(loginDTO.getUsername());

        if (optionalUser.isEmpty()) {
            return new CommonResponse("User not found", 404, null, null);
        }

        Users user = optionalUser.get();

        boolean passwordMatch = passwordEncoder.matches(
            loginDTO.getPassword(), user.getPassword()
        );

        if (passwordMatch && user.getDelflag().equals("N")) {
            String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuaXJhamFkbWluIn0.k7KLMPh_wFPDhUOm3rE--dpUz50piu2g8HRA20Z93Ys1csalesqXjdArjLDB-xUOfTf__NAVqHStbT6-4Zwaag";
            
            user.setConfirmpassword(null);
            user.setPassword(null);
            return new CommonResponse("Login successful", 200, token, user);
        } else {
            return new CommonResponse("Invalid credentials", 401, null, null);
        }
    }
    
    
}
