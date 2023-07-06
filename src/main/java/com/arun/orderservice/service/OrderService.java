package com.arun.orderservice.service;

import com.arun.orderservice.dto.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();
}
