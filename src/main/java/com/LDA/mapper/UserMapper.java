package com.LDA.mapper;

import com.LDA.entity.Users;
import com.LDA.model.request.UsersRequest;
import org.springframework.beans.BeanUtils;

public class UserMapper {

    public  static Users toUser(UsersRequest usersRequest){
        Users users = new Users();
        BeanUtils.copyProperties(usersRequest, users);
        return users;
    }
}