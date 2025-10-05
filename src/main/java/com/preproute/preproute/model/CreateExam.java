package com.preproute.preproute.model;


import java.time.LocalDateTime;
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
@Table(name = "createexam")
public class CreateExam {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String title;
	 	private String  examname;   
	 	private Integer examduration;
	 	private Boolean switchable;
	 	private String  code;  
	 	private LocalDateTime startTime;
	 	private LocalDateTime endTime;
	  	private String description; // Extra details (optional)
	  	
	  	@Builder.Default
		private LocalDateTime  createdAt =  LocalDateTime.now();
		
		@Builder.Default
		private LocalDateTime updatedAt = LocalDateTime.now();
		
		@Builder.Default
		private String  delflag="N";
	    
		
		private Long noofquestion;
		
		 @ManyToOne
		    @JoinColumn(name = "exam_id")
		    private ExamType examType;
		 
		 private String  examtypename;
		 
		 
		  @ManyToOne
		     @JoinColumn(name = "section_id")
		     private Sections sections;
		 
		
		  private String  sectionsname;
		  
		  
		   @ManyToOne
		     @JoinColumn(name = "topic_id")
		     private Topic topic;
		   
		   
		   private String  topicname;
		
		
		   
		   @ManyToOne
		     @JoinColumn(name = "subtopic_id")
		     private SubTopic subtopic;
		   
		   
		   private String  subtopicname;
		
		   
		   
		   
		
		
		
		
}
