package com.LDA.service.impl;

import com.LDA.entity.CandidateDetails;
import com.LDA.repository.CandidateDetailsRepository;
import com.LDA.service.CandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateDetailsServiceImpl implements CandidateDetailsService {
    @Autowired
    private CandidateDetailsRepository candidateDetailsRepository;

    public CandidateDetails saveCandidateDetails(CandidateDetails candidateDetails) {
        return candidateDetailsRepository.save(candidateDetails);
    }
}
