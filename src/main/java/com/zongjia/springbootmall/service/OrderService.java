package com.zongjia.springbootmall.service;

import com.zongjia.springbootmall.dto.CreateOrderRequest;
import com.zongjia.springbootmall.dto.OrderQueryParams;
import com.zongjia.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
