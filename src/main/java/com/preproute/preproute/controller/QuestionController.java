package com.preproute.preproute.controller;



import com.preproute.preproute.model.Question;
import com.preproute.preproute.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // Add a single question
    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
        Question saved = questionService.addQuestion(question);
        return ResponseEntity.ok(saved);
    }

    // Get questions for a specific exam
    @GetMapping("/exam/{examId}")
    public ResponseEntity<List<Question>> getQuestionsByExam(@PathVariable Long examId) {
        List<Question> questions = questionService.getQuestionsByExam(examId);
        return ResponseEntity.ok(questions);
    }

    // Get all questions
    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.getAllQuestions();
        return ResponseEntity.ok(questions);
    }
}

