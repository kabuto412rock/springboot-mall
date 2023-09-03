package com.zongjia.springbootmall.service;

import com.zongjia.springbootmall.dto.UserLoginRequest;
import com.zongjia.springbootmall.dto.UserRegisterRequest;
import com.zongjia.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
