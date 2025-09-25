package com.preproute.preproute.controller;



import com.preproute.preproute.model.master.YearsMaster;
import com.preproute.preproute.service.YearsMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/yearsmaster")
public class YearsMasterController {

    @Autowired
    private YearsMasterService yearsmasterService;

    @PostMapping("/create")
    public ResponseEntity<YearsMaster> createYearsMaster(@RequestBody YearsMaster yearsmaster) {
        return ResponseEntity.ok(yearsmasterService.createYearsMaster(yearsmaster));
    }

    @GetMapping
    public List<YearsMaster> getAllYearsMaster() {
        return yearsmasterService.getAllYearsMaster();
    }
}
