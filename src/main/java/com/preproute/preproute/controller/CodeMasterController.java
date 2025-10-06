package com.preproute.preproute.controller;

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
    public int deleteFlag(
            @RequestParam Long id,
            @RequestParam String delflag
    ) {
        return codeMasterRepository.setDelFlagNOrY(id, delflag);
    }
    
    
}

