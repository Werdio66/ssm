package com._520.ssm.test;

import com._520.ssm.domain.User;
import com._520.ssm.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private UserService userService;
    @Test
    void test1(){
        userService.listAll().forEach(System.out::println);
    }

    @Test
    void save(){
        User user = new User();
        user.setUsername("aaa");
        user.setPassword("2222");
        userService.save(user);
    }
}
