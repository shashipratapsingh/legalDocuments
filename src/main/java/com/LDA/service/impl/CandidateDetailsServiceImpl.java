package com.LDA.service.impl;

import com.LDA.entity.CandidateDetails;
import com.LDA.repository.CandidateDetailsRepository;
import com.LDA.service.CandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

@Service
public class CandidateDetailsServiceImpl implements CandidateDetailsService {

    @Autowired
    private CandidateDetailsRepository candidateDetailsRepository;

    @Value("${file.upload-dir}") // From application.properties
    private String uploadDir;

    public CandidateDetails saveCandidateDetails(CandidateDetails candidateDetails, MultipartFile aadharCardFile) throws IOException {

        // Generate a unique filename
        String fileName = aadharCardFile.getOriginalFilename();

        // Ensure the directory exists
        File directory = new File(uploadDir);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Define the path where the file will be saved
        File filePath = new File(uploadDir + "/" + fileName);

        // Save the file to the specified location
        aadharCardFile.transferTo(filePath);

        // Set the file name and URL in the candidateDetails entity
        candidateDetails.setAadharCardFileName(fileName);
        candidateDetails.setAadharCardFilePath("/documents/" + fileName);  // Assuming the images are served from this path
        return candidateDetailsRepository.save(candidateDetails);
    }
    @Override
    public CandidateDetails getCandidateDetailsById(int id) {
        Optional<CandidateDetails> candidateDetailsOptional = candidateDetailsRepository.findById(id);
        return candidateDetailsOptional.orElse(null); // Return null if not found
    }
}
