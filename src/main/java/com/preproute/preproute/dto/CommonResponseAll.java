package com.preproute.preproute.dto;


import com.preproute.preproute.model.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponseAll {
    private String message;
    private int statusCode;
    private String token;
    private Object user; // Optional - be cautious about what user details you return
   
}