package com.preproute.preproute.dto;

import java.time.LocalDateTime;

import com.preproute.preproute.model.ExamType;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SectionDTO {

	
	private Long id;
 	private String sectiontype;
 	private String description; 
	private LocalDateTime  createdAt; 
	private LocalDateTime updatedAt;
	private String others;
	

    private ExamType examType;
}
