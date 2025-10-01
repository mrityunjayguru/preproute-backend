package com.preproute.preproute.service;



import com.preproute.preproute.model.CreateExam;
import com.preproute.preproute.repository.CreateExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.*;

import java.util.List;

@Service
public class CreateExamService {

    @Autowired
    private CreateExamRepository createexamRepository;

    public CreateExam createExam(CreateExam createexam) {
        return createexamRepository.save(createexam);
    }

    public List<CreateExam> getAllCreateExam() {
        return createexamRepository.findAll();
    }
    
    
    public Page<CreateExam> getPaginatedCreateExam(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).descending() );
        return createexamRepository.findAll(pageable);
    }
}
