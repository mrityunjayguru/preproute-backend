package com.preproute.preproute.repository;


import com.preproute.preproute.model.Sections;
import com.preproute.preproute.model.Topic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
	
	@Query(value = "SELECT * FROM topic WHERE section_id = :section_id", nativeQuery = true)
    List<Topic> findBySectionId(@Param("section_id") Long section_id);
}