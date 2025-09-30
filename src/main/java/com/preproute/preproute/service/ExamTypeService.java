package com.preproute.preproute.service;

import com.preproute.preproute.model.ExamType;
import com.preproute.preproute.repository.ExamTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.*;

import java.util.List;

@Service
public class ExamTypeService {

    @Autowired
    private ExamTypeRepository examTypeRepository;

    public ExamType createExam(ExamType examType) {
        return examTypeRepository.save(examType);
    }

    public List<ExamType> getAllExams() {
        return examTypeRepository.findAll();
    }
    
    
    public Page<ExamType> getPaginatedExamTypes(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        return examTypeRepository.findAll(pageable);
    }
}
