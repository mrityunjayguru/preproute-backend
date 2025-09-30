package com.preproute.preproute.service;

import com.preproute.preproute.model.Topic;
import com.preproute.preproute.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopic() {
        return topicRepository.findAll();
    }
}
