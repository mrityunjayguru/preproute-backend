package com.preproute.preproute.repository;


import com.preproute.preproute.model.CreateExam;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CreateExamRepository extends JpaRepository<CreateExam, Long> {
    Optional<CreateExam> findByName(String name);
}