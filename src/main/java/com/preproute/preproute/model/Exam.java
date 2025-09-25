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
@Table(name = "exam")
public class Exam {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String title;
	 	private String  name;        
	 	private String  code;  
	 	private LocalDateTime startTime;
	 	private LocalDateTime endTime;
	  	private String description; // Extra details (optional)
		private LocalDateTime  createdAt; 
		private LocalDateTime updatedAt;
}
