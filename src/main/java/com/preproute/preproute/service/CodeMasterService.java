package com.preproute.preproute.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preproute.preproute.model.master.CodeMaster;
import com.preproute.preproute.repository.CodeMasterRepository;

@Service
public class CodeMasterService {

	 @Autowired
	    private CodeMasterRepository codemasterRepository;

	    public CodeMaster createCodeMaster(CodeMaster codemaster) {
	        return codemasterRepository.save(codemaster);
	    }

	    public List<CodeMaster> getAllCodeMaster() {
	        return codemasterRepository.findAll();
	    }
	
	
}
