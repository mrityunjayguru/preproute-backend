package com.preproute.preproute.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;




@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class Users {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String email;
    private String phone;
    
    private String password;

    private String role; // e.g., ROLE_ADMIN, ROLE_STUDENT
    
    private String confirmpassword;
    private String exam;
    private String firstname;
    private String lastname;
    private String name;
    private String step;
    private String stream;
    private String year;
    private String usertype;
    private String source ;
    
	@Builder.Default
	private LocalDateTime  createdAt =  LocalDateTime.now();
	
	@Builder.Default
	private LocalDateTime updatedAt = LocalDateTime.now();
	
	
	
	 @Builder.Default
	private String  delflag="N";
    
    

    // Constructors, getters, setters
}

