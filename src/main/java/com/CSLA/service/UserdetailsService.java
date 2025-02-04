package com.CSLA.service;


import com.CSLA.entity.Userdetails;
import com.CSLA.repository.UserdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserdetailsService {

    @Autowired
    private UserdetailsRepository repository;

    public Userdetails saveUserdetails(Userdetails userdetails) {
        return repository.save(userdetails);
    }

    // Other business methods (if any)
}
