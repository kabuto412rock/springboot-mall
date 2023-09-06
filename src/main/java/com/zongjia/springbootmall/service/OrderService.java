package com.zongjia.springbootmall.service;

import com.zongjia.springbootmall.dto.CreateOrderRequest;
import com.zongjia.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
