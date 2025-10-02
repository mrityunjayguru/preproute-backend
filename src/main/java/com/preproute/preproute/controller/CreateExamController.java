package com.preproute.preproute.controller;


import com.preproute.preproute.model.CreateExam;
import com.preproute.preproute.service.CreateExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/createexam")
public class CreateExamController {

    @Autowired
    private CreateExamService createexamService;

    @PostMapping("/create")
    public ResponseEntity<CreateExam> createExam(@RequestBody CreateExam createexam) {
        return ResponseEntity.ok(createexamService.createExam(createexam));
    }


    // Test
    @GetMapping("/getdatabycreateexamname")
    public ResponseEntity<Optional<CreateExam>> getdatabycreateexamname(@RequestParam String name) {
        return ResponseEntity.ok(createexamService.getAllByName(name));
    }


    @GetMapping
    public List<CreateExam> getAllExams() {
        return createexamService.getAllCreateExam();
    }
    
    @GetMapping("/getdatapagination")
    public Page<CreateExam> getPaginatedCreateExam(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return createexamService.getPaginatedCreateExam(page, size, sortBy);
    }
    
    
}
