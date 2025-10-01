package com.preproute.preproute.controller;



import com.preproute.preproute.model.Question;
import com.preproute.preproute.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;


import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/create")
    public ResponseEntity<Question> createquestion(@RequestBody Question question) {
        return ResponseEntity.ok(questionService.createQuestion(question));
    }

    @GetMapping
    public List<Question> getAllquestion() {
        return questionService.getAllQuestion();
    }
    
    @GetMapping("/getdatapagination")
    public Page<Question> getPaginatedExamTypes(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return questionService.getPaginatedQuestion(page, size, sortBy);
    }
    
    
}
