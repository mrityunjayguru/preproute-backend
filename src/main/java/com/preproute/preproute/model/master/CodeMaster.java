package com.preproute.preproute.model.master;

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
@Table(name = "codemaster")

public class CodeMaster {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String name;
	 	private String code;
	 	private String  description;        
	 	private LocalDateTime  createdAt; 
		private LocalDateTime updatedAt;

}
