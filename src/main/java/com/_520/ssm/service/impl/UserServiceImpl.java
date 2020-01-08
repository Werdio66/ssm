package com._520.ssm.service.impl;

import com._520.ssm.dao.UserDao;
import com._520.ssm.domain.User;
import com._520.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listAll() {
        System.out.println("查询所有的员工！");
        return userDao.listAll();
    }
}
