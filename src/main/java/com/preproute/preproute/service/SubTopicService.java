package com.preproute.preproute.service;


import com.preproute.preproute.model.SubTopic;
import com.preproute.preproute.repository.SubTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubTopicService {

    @Autowired
    private SubTopicRepository subtopicRepository;

    public SubTopic createTopic(SubTopic subtopic) {
        return subtopicRepository.save(subtopic);
    }

    public List<SubTopic> getAllSubTopic() {
        return subtopicRepository.findAll();
    }
}
