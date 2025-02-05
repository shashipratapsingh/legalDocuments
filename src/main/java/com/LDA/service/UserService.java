package com.LDA.service;

import com.LDA.model.request.UsersRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int createUser(UsersRequest usersRequest);
}