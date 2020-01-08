package com._520.ssm.mapper;

import com._520.ssm.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    void save(User user);
}
