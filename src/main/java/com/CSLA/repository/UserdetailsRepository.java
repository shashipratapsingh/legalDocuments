package com.CSLA.repository;



import com.CSLA.entity.Userdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserdetailsRepository extends JpaRepository<Userdetails, Integer> {
    // Custom query methods (if any)
}

