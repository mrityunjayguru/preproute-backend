package com.preproute.preproute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.preproute.preproute.model.master.StatusMaster;

@Repository
public interface StatusMasterRepository extends JpaRepository<StatusMaster, Long> {

}
