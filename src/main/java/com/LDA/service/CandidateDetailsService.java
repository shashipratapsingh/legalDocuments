package com.LDA.service;
import com.LDA.entity.CandidateDetails;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface CandidateDetailsService {

    CandidateDetails saveCandidateDetails(CandidateDetails candidateDetails, MultipartFile aadharCardFile) throws IOException;
    CandidateDetails getCandidateDetailsById(int id);
}
