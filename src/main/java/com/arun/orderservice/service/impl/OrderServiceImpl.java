package com.arun.orderservice.service.impl;

import com.arun.orderservice.dao.OrderDAO;
import com.arun.orderservice.dto.Order;
import com.arun.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;
    @Override
    public List<Order> getAllOrders() {
        return orderDAO.fetchAllOrder();
    }
}