package com.preproute.preproute.repository;

import com.preproute.preproute.model.Sections;
import com.preproute.preproute.model.SubTopic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTopicRepository extends JpaRepository<SubTopic, Long> {
	
	@Query(value = "SELECT * FROM subtopic WHERE topic_id = :topic_id", nativeQuery = true)
    List<SubTopic> findTopicByTopicId(@Param("topic_id") Long topic_id);
}