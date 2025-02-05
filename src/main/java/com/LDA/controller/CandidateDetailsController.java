package com.LDA.controller;

import com.LDA.entity.CandidateDetails;

import com.LDA.service.CandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class CandidateDetailsController  {

    @PreAuthorize("hasAnyAuthority('ROLE_Admin', 'ROLE_Manager', 'ROLE_User')")
    @GetMapping("/profile")
    public String userProfile() {
        return "User Profile";
    }

    @Autowired
    private CandidateDetailsService candidateDetailsService;

    @PostMapping("/")
    @PreAuthorize("hasAnyAuthority('ROLE_Admin', 'ROLE_Manager', 'ROLE_User')")
    public ResponseEntity<CandidateDetails> createCandidateDetails(@RequestBody CandidateDetails candidateDetails) {
        CandidateDetails savedCandidateDetails = candidateDetailsService.saveCandidateDetails(candidateDetails);
        return ResponseEntity.ok(savedCandidateDetails);
    }

}
