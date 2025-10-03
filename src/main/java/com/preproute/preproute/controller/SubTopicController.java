package com.preproute.preproute.controller;


import com.preproute.preproute.model.SubTopic;
import com.preproute.preproute.model.Topic;
import com.preproute.preproute.repository.SubTopicRepository;
import com.preproute.preproute.service.SubTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/subtopic")
public class SubTopicController {

    @Autowired
    private SubTopicService subtopicService;
    
    @Autowired
    private SubTopicRepository subTopicRepository;

    @PostMapping("/create")
    public ResponseEntity<SubTopic> createTopic(@RequestBody SubTopic subtopic) {
        return ResponseEntity.ok(subtopicService.createTopic(subtopic));
    }

    @GetMapping
    public List<SubTopic> getAllSubTopic() {
        return subtopicService.getAllSubTopic();
    }
    
    
    
    @GetMapping("/getallsubtopicsbytopicid")
    public List<SubTopic> getallsybtopicsbytopicid(@RequestParam Long topicid ) {
        return subTopicRepository.findTopicByTopicId(topicid);
    }
    
    
    
    
}