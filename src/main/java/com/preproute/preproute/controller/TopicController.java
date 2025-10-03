package com.preproute.preproute.controller;


import com.preproute.preproute.model.Sections;
import com.preproute.preproute.model.Topic;
import com.preproute.preproute.repository.TopicRepository;
import com.preproute.preproute.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;
    
    @Autowired
    private TopicRepository topicRepository;

    @PostMapping("/create")
    public ResponseEntity<Topic> createTopic(@RequestBody Topic topic) {
        return ResponseEntity.ok(topicService.createTopic(topic));
    }

    @GetMapping
    public List<Topic> getAllTopic() {
        return topicService.getAllTopic();
    }
    
    @GetMapping("/getalltopicsbysectionid")
    public List<Topic> getAllTopicBySectionId(@RequestParam Long sectionid ) {
        return topicRepository.findBySectionId(sectionid);
    }
    
    
    
}