package com.preproute.preproute.controller;

import com.preproute.preproute.model.master.CodeMaster;
import com.preproute.preproute.service.CodeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/codemaster")
public class CodeMasterController {

    @Autowired
    private CodeMasterService codemasterService;

    @PostMapping("/create")
    public ResponseEntity<CodeMaster> createExam(@RequestBody CodeMaster codemaster) {
        return ResponseEntity.ok(codemasterService.createCodeMaster(codemaster));
    }

    @GetMapping
    public List<CodeMaster> getAllCodeMaster() {
        return codemasterService.getAllCodeMaster();
    }
}

