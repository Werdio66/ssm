package com._520.ssm.dao.impl;

import com._520.ssm.domain.User;
import com._520.ssm.dao.UserDao;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Override

    public List<User> listAll() {
        return null;
    }
}
