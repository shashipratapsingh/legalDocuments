package com.LDA.service;


import com.LDA.entity.CandidateDetails;
import com.LDA.repository.CandidateDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateDetailsService {

    @Autowired
    private CandidateDetailsRepository candidateDetailsRepository;

    public CandidateDetails saveCandidateDetails(CandidateDetails candidateDetails) {
        return candidateDetailsRepository.save(candidateDetails);
    }

    // Other business methods (if any)
}
