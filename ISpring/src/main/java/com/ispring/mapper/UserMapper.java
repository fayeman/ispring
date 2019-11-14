package com.ispring.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ispring.bean.User;

@Repository
public interface UserMapper {
    public int saveUser(User user);
    public List<User> queryAll();
}
