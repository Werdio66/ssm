package com._520.ssm.service.impl;

import com._520.ssm.mapper.UserMapper;
import com._520.ssm.domain.User;
import com._520.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public List<User> listAll() {
        System.out.println("查询所有的员工！");
        return userMapper.selectAll();
    }

    @Override
    public void save(User user) {
        System.out.println("保存员工");
        userMapper.save(user);
        int a = 1 / 0;
    }
}
