package com.preproute.preproute.controller;

import com.preproute.preproute.model.master.StatusMaster;
import com.preproute.preproute.service.StatusMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/statusmaster")
public class StatusMasterController {

    @Autowired
    private StatusMasterService statusmasterService;

    @PostMapping("/create")
    public ResponseEntity<StatusMaster> createStatusMaster(@RequestBody StatusMaster statusmaster) {
        return ResponseEntity.ok(statusmasterService.createStatusMaster(statusmaster));
    }

    @GetMapping
    public List<StatusMaster> getAllStatusMaster() {
        return statusmasterService.getAllStatusMaster();
    }
}

