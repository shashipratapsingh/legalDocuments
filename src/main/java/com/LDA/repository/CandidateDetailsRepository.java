package com.LDA.repository;



import com.LDA.entity.CandidateDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateDetailsRepository extends JpaRepository<CandidateDetails, Integer> {
}

