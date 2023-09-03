package com.zongjia.springbootmall.service.impl;

import com.zongjia.springbootmall.dao.UserDao;
import com.zongjia.springbootmall.dto.UserRegisterRequest;
import com.zongjia.springbootmall.model.User;
import com.zongjia.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
