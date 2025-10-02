package com.preproute.preproute.repository;


import com.preproute.preproute.model.CreateExam;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CreateExamRepository extends JpaRepository<CreateExam, Long> {
	@Query(value = "SELECT * FROM createexam WHERE examname = :name", nativeQuery = true)
    Optional<CreateExam> findByNameNative(@Param("name") String name);
}