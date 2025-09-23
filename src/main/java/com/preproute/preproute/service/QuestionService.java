package com.preproute.preproute.service;



import com.preproute.preproute.model.Question;
import com.preproute.preproute.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> getQuestionsByExam(Long examId) {
        return questionRepository.findByExamId(examId);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}

