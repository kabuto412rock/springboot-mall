package com.zongjia.springbootmall.dao;

import com.zongjia.springbootmall.dto.UserRegisterRequest;
import com.zongjia.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
}
