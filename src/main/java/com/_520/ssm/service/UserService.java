package com._520.ssm.service;

import com._520.ssm.domain.User;

import java.util.List;

public interface UserService {

    public List<User> listAll();

    void save(User user);
}
