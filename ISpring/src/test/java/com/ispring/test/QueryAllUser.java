package com.ispring.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ispring.bean.User;
import com.ispring.mapper.UserMapper;

public class QueryAllUser {
    private ApplicationContext ctx;

	@Test
    public void queryAllUser(){
        System.out.println("start-------------------------");
        ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //获得bean
        UserMapper usermapper = ctx.getBean(UserMapper.class);

        List<User> userlist = usermapper.queryAll();
        for(User i: userlist){
            System.out.println("id: "+i.getId());
            System.out.println("name: "+i.getName());
            System.out.println("birth: "+i.getBirth());
        }
    }
}