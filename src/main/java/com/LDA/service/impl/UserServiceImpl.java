package com.LDA.service.impl;

import com.LDA.entity.Users;
import com.LDA.mapper.UserMapper;
import com.LDA.model.request.UsersRequest;
import com.LDA.repository.UsersRepository;
import com.LDA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository repository;

    @Override
    public int createUser(UsersRequest usersRequest) {
        Users users = UserMapper.toUser(usersRequest);
        users = repository.save(users);
        return users.getId();
    }
}
