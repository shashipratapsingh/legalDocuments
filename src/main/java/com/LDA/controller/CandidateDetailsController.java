package com.LDA.controller;

import com.LDA.entity.CandidateDetails;
import com.LDA.service.CandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/user")
public class CandidateDetailsController  {

    @Autowired
    private CandidateDetailsService candidateDetailsService;

    @PreAuthorize("hasAnyAuthority('ROLE_Admin', 'ROLE_Manager', 'ROLE_User')")
    @GetMapping("/profile")
    public String userProfile() {
        return "User Profile";
    }

    @PostMapping("/")
    @PreAuthorize("hasAnyAuthority('ROLE_Admin', 'ROLE_Manager', 'ROLE_User')")
    public ResponseEntity<CandidateDetails> createCandidateDetails(
            @RequestPart("candidateDetails") CandidateDetails candidateDetails,
            @RequestPart("aadharCardFile") MultipartFile aadharCardFile) throws IOException {

        // Call the service method to handle file upload and save candidate details
        CandidateDetails savedCandidateDetails = candidateDetailsService.saveCandidateDetails(candidateDetails, aadharCardFile);
        return ResponseEntity.ok(savedCandidateDetails);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_Admin', 'ROLE_Manager', 'ROLE_User')")
    public ResponseEntity<CandidateDetails> getCandidateDetailsById(@PathVariable("id") int id) {
        CandidateDetails candidateDetails = candidateDetailsService.getCandidateDetailsById(id);
        if (candidateDetails != null) {
            return ResponseEntity.ok(candidateDetails);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if candidate not found
        }
    }
}
