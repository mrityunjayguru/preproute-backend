package com.preproute.preproute.repository;


import com.preproute.preproute.model.CreateExam;
import com.preproute.preproute.model.Sections;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionsRepository extends JpaRepository<Sections, Long> {
	
	@Query(value = "SELECT * FROM sections WHERE exam_id = :exam_id", nativeQuery = true)
    List<Sections> findByExamId(@Param("exam_id") Long exam_id);
}