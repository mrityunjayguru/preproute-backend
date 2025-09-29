package com.preproute.preproute.service;


import com.preproute.preproute.model.Sections;
import com.preproute.preproute.repository.SectionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionsService {

    @Autowired
    private SectionsRepository sectionsRepository;

    public Sections createSections(Sections examType) {
        return sectionsRepository.save(examType);
    }

    public List<Sections> getAllSections() {
        return sectionsRepository.findAll();
    }
}
