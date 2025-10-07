package com.preproute.preproute.repository;


import com.preproute.preproute.model.CreateExam;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Repository
public interface CreateExamRepository extends JpaRepository<CreateExam, Long> {
	@Query(value = "SELECT * FROM createexam WHERE examname = :name", nativeQuery = true)
    List<CreateExam> findByExamname(@Param("name") String name);
	
	
	
	 @Query(value = "SELECT * FROM createexam WHERE exam_id = :exam_id", nativeQuery = true)
	 List<CreateExam> findByexamid(@Param("exam_id") Long exam_id);
	 
	 
	 

	 @Query(value = "SELECT * FROM createexam WHERE exam_id = :exam_id and examname= :examname and  delflag='N' ", nativeQuery = true)
	 List<CreateExam> findByexamidAndExamName(@Param("exam_id") Long exam_id,@Param("examname") String  examname);
	 
	
	
	
	@Query(value = "SELECT * FROM createexam WHERE delflag='N' ", nativeQuery = true)
    List<CreateExam> findAllHavingDelFlagIsN();
	
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE createexam SET delflag = :delflag WHERE id = :id", nativeQuery = true)
    public	int setDelFlagNOrY(@Param("id") Long id, @Param("delflag") String delflag);
	
	
}