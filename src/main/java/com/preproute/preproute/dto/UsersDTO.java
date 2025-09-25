package com.preproute.preproute.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    private String username;
    private String password;
    private String email;
    private String phone;
    private String role;
}



