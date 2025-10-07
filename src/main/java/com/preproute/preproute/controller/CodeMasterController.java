package com.preproute.preproute.controller;

import com.preproute.preproute.dto.CommonResponse;
import com.preproute.preproute.dto.CommonResponseAll;
import com.preproute.preproute.model.master.CodeMaster;
import com.preproute.preproute.repository.CodeMasterRepository;
import com.preproute.preproute.service.CodeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/codemaster")
public class CodeMasterController {

    @Autowired
    private CodeMasterRepository codeMasterRepository;
    
    @Autowired
    private CodeMasterService codemasterService;

    @PostMapping("/create")
    public ResponseEntity<CodeMaster> createCodeMaster(@RequestBody CodeMaster codemaster) {
        return ResponseEntity.ok(codemasterService.createCodeMaster(codemaster));
    }

    @GetMapping
    public List<CodeMaster> getAllCodeMaster() {
        return codemasterService.getAllCodeMaster();
    }
    
    
    @PostMapping("/delete")
    public CommonResponseAll deleteFlag(@RequestBody CodeMaster codemaster) {
        int i =  codeMasterRepository.setDelFlagNOrY(codemaster.getId() , codemaster.getDelflag());
       
        if(i==0)
        {
        	return new CommonResponseAll("Unable to update data, row(s) affected :-  "+i, 200, null, null);
        }
        else
        {
        	return new CommonResponseAll("Data updated successfully, row(s) affected :-  "+i, 200, null, null);
        }
               
    }
    
    
}

