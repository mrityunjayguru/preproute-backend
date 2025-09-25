package com.preproute.preproute.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.preproute.preproute.model.master.YearsMaster;

@Repository
public interface YearsMasterRepository extends JpaRepository<YearsMaster, Long> {

}
