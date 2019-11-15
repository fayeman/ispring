package com.ispring.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ispring.bean.User;
import com.ispring.mapper.UserMapper;

public class TestSpringMyBatis {
    private ApplicationContext ctx;

	@Test
    public void saveUser() {
        System.out.println("start-----saveUser--------------------");
        ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //获得bean
        UserMapper UserMapper = ctx.getBean(UserMapper.class);
        //访问数据库
        User user = new User();
        user.setBirth("2000-01-01");
        user.setId(""+System.currentTimeMillis());
        user.setName("tom");
        UserMapper.saveUser(user);
        System.out.println("end-----saveUser-----------------------");
    }
}