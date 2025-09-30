package com.preproute.preproute.controller;


import com.preproute.preproute.model.ExamType;
import com.preproute.preproute.service.ExamTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;


import java.util.List;

@RestController
@RequestMapping("/api/examstype")
public class ExamTypeController {

    @Autowired
    private ExamTypeService examTypeService;

    @PostMapping("/create")
    public ResponseEntity<ExamType> createExam(@RequestBody ExamType examType) {
        return ResponseEntity.ok(examTypeService.createExam(examType));
    }

    @GetMapping
    public List<ExamType> getAllExams() {
        return examTypeService.getAllExams();
    }
    
    @GetMapping("/getdatapagination")
    public Page<ExamType> getPaginatedExamTypes(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return examTypeService.getPaginatedExamTypes(page, size, sortBy);
    }
    
    
}
