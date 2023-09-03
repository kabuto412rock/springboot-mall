package com.zongjia.springbootmall.dao;

import com.zongjia.springbootmall.dto.UserRegisterRequest;
import com.zongjia.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
