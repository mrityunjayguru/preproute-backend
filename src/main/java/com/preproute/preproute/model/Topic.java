package com.preproute.preproute.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "topic")
public class Topic {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
 	private String topictype;
 	private String description; 
 	
 	@Builder.Default
	private LocalDateTime  createdAt =  LocalDateTime.now();
	
	@Builder.Default
	private LocalDateTime updatedAt = LocalDateTime.now();
	
	@Builder.Default
	private String  delflag="N";
    
	
	private String others;
	
	     @ManyToOne
	     @JoinColumn(name = "section_id")
	     private Sections sections;
	     
	     @ManyToOne
		    @JoinColumn(name = "exam_id")
		    private ExamType examType;
	     
	     
	     
	     
}
