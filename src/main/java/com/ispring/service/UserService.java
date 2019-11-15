package com.ispring.service;

import java.util.List;
import com.ispring.bean.User;

public interface UserService {
    public int saveUser(User user);
    public List<User> queryAll();
}