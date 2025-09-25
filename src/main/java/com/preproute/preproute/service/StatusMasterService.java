package com.preproute.preproute.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preproute.preproute.model.master.StatusMaster;
import com.preproute.preproute.repository.StatusMasterRepository;

@Service
public class StatusMasterService {

	 @Autowired
	    private StatusMasterRepository statusmasterRepository;

	    public StatusMaster createStatusMaster(StatusMaster statusmaster) {
	        return statusmasterRepository.save(statusmaster);
	    }

	    public List<StatusMaster> getAllStatusMaster() {
	        return statusmasterRepository.findAll();
	    }
		
}

