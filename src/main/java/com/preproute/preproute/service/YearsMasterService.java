package com.preproute.preproute.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preproute.preproute.model.master.YearsMaster;

import com.preproute.preproute.repository.YearsMasterRepository;

@Service
public class YearsMasterService {

	 @Autowired
	    private YearsMasterRepository yearsmasterRepository;

	    public YearsMaster createYearsMaster(YearsMaster yearsmaster) {
	        return yearsmasterRepository.save(yearsmaster);
	    }

	    public List<YearsMaster> getAllYearsMaster() {
	        return yearsmasterRepository.findAll();
	    }
	
	
}