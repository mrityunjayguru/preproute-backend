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
    private Long questiontype;
    private Long questionsolution;
    private Long answertype;
    private String previewwindow;
    private String sectiontype;
    private String topicname;
    private String subtopicname;
    private String examtype;
    private String others;
    private LocalDateTime  createdAt; 
	private LocalDateTime updatedAt;












    
    


  
    
    
 
}