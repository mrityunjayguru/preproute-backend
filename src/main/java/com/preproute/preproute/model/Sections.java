package com.preproute.preproute.model;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "sections")
public class Sections {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String sectiontype;
	 	private String description; 
		private LocalDateTime  createdAt; 
		private LocalDateTime updatedAt;
		private String others;
		private Integer sectionnumberofquestion;
		
		@ManyToOne
	    @JoinColumn(name = "exam_id", nullable = false)
	    private ExamType examType;	
}


