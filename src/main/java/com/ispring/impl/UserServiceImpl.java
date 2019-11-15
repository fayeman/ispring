package com.ispring.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispring.bean.User;
import com.ispring.mapper.UserMapper;
import com.ispring.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper usermapper;

    @Override
    public int saveUser(User media){
        return usermapper.saveUser(media);
    }
    @Override
    public List<User> queryAll(){
        return usermapper.queryAll();
    }
}