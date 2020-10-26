package com.lu.mapper;

import com.lu.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Component
public interface UserMapper {
    List<User> findUserAll();
    User queryUser(User user);
}
