package com.preproute.preproute.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "question")



public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;

    private String examformat;
    private Long numberofquestion;
    private  String questiontype;
    private  String questionsolution;
    private String answertype;
    private String previewwindow;
    private String sectiontype;
    private String topicname;
    private String subtopicname;
    private String examtype;
    private String others;
    
    @Builder.Default
	private LocalDateTime  createdAt =  LocalDateTime.now();
	
	@Builder.Default
	private LocalDateTime updatedAt = LocalDateTime.now();
	
	@Builder.Default
	private String  delflag="N";
    











    
    


  
    
    
 
}