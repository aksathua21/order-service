package com.arun.orderservice.dao;

import com.arun.orderservice.dto.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDAO {
    public List<Order> fetchAllOrder() {
        Order order = new Order(1, "Mobile", "Arun", 28000.00);
        Order order1 = new Order(2, "Earphone", "Deepesh", 300.00);
        Order order2 = new Order(3, "Cup", "Bhupesh", 120.00);
        Order order3 = new Order(4, "Laptop", "Summan", 40000.00);
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        return orders;
    }
}
