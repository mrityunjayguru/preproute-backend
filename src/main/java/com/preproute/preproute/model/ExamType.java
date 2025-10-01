package com.preproute.preproute.model;

import java.time.LocalDateTime;


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
@Table(name = "examtype")
public class ExamType {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String title;
	 	private String  name;   
	 	private Integer examduration;
	 	private Boolean switchable;
	 	private String  code;  
	 	private LocalDateTime startTime;
	 	private LocalDateTime endTime;
	  	private String description; // Extra details (optional)
		private LocalDateTime  createdAt; 
		private LocalDateTime updatedAt;
}
