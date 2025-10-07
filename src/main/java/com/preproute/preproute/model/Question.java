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

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String optionA;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String optionB;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String optionC;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String optionD;

    @Lob
    @Column(columnDefinition = "TEXT")
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
    private String examtypename;
    private String creaeeexamname;
    
    private String others;
    
    @Builder.Default
	private LocalDateTime  createdAt =  LocalDateTime.now();
	
	@Builder.Default
	private LocalDateTime updatedAt = LocalDateTime.now();
	
	
	
	 @ManyToOne
	    @JoinColumn(name = "exam_id")
	    private ExamType examtype;
	 
	 
	 
	 
	  @ManyToOne
	     @JoinColumn(name = "section_id")
	     private Sections sections;
	 
	
	  private String  sectionsname;
	  
	  
	   @ManyToOne
	     @JoinColumn(name = "topic_id")
	     private Topic topic;
	   
	   
	  
	
	
	   
	   @ManyToOne
	     @JoinColumn(name = "subtopic_id")
	     private SubTopic subtopic;
	   
	   
	 
	   @ManyToOne
	     @JoinColumn(name = "createexam_id")
	     private CreateExam createexam;
	  
	
	
	
	
	@Builder.Default
	private String  delflag="N";
    











    
    


  
    
    
 
}