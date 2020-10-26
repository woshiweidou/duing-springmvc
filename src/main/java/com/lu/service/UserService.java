package com.lu.service;

import com.lu.ThreadLocalManager;
import com.lu.entity.User;
import com.lu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public boolean login(User user){
        User user1 = userMapper.queryUser(user);
        if(user1  != null){
            ThreadLocal threadLocal = ThreadLocalManager.getThreadLocal(user.getUsername());
            threadLocal.set(user1.getRealname());
            return true;
        }else {
            return false;
        }
    }
}
