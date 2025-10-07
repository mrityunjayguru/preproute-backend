package com.preproute.preproute.controller;


import com.preproute.preproute.model.CreateExam;
import com.preproute.preproute.repository.CreateExamRepository;
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

    @Autowired
    private CreateExamRepository createExamRepository;

    
    @PostMapping("/create")
    public ResponseEntity<CreateExam> createExam(@RequestBody CreateExam createexam) {
        return ResponseEntity.ok(createexamService.createExam(createexam));
    }

    @GetMapping("/getdatabycreateexamname")
    public List<CreateExam> getDataByCreateExamName(@RequestParam String name) {
        return createexamService.getAllByName(name);
    }

    
    
    @GetMapping("/getdatabyid")
    public Optional<CreateExam> getDataById(@RequestParam Long id) {
        return createExamRepository.findById(id);
    }
    
    
    @GetMapping("/getdatabyexamtypeid")
    public List<CreateExam> getdatabyexamtypeid(@RequestParam Long examtypeid) {
        return createExamRepository.findByexamid(examtypeid);
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
