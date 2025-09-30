package com.preproute.preproute.repository;

import com.preproute.preproute.model.SubTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTopicRepository extends JpaRepository<SubTopic, Long> {
}