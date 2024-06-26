package com.cskaoyan.user.service;

import com.cskaoyan.th58.model.User;
import com.cskaoyan.user.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper usermapper;

    public String queryById(Long id){
       User user = usermapper.findById(id);
       return user.getAddress();
    }
}
