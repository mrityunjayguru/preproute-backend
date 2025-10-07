package com.preproute.preproute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.preproute.preproute.model.SubTopic;
import com.preproute.preproute.model.master.CodeMaster;

@Repository
public interface CodeMasterRepository extends JpaRepository<CodeMaster, Long> {
	
	@Query(value = "SELECT * FROM codemaster WHERE delflag='N' ", nativeQuery = true)
    List<CodeMaster> findAllHavingDelFlagIsN();
	
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE codemaster SET delflag = :delflag WHERE id = :id", nativeQuery = true)
    public	int setDelFlagNOrY(@Param("id") Long id, @Param("delflag") String delflag);
	
	
	
	
}