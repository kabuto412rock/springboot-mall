package com.zongjia.springbootmall.service;

import com.zongjia.springbootmall.dto.UserRegisterRequest;
import com.zongjia.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
}
