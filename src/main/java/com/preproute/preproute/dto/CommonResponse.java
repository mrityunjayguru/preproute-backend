package com.preproute.preproute.dto;

import com.preproute.preproute.model.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class CommonResponse {
    private String message;
    private int statusCode;
    private String token;
    private Users user; // Optional - be cautious about what user details you return

    
}
