package com.preproute.preproute.controller;



import com.preproute.preproute.model.Sections;
import com.preproute.preproute.service.SectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sections")
public class SectionsController {

    @Autowired
    private SectionsService sectionsService;

    @PostMapping("/create")
    public ResponseEntity<Sections> createExam(@RequestBody Sections sections) {
        return ResponseEntity.ok(sectionsService.createSections(sections));
    }

    @GetMapping
    public List<Sections> getAllExams() {
        return sectionsService.getAllSections();
    }
}