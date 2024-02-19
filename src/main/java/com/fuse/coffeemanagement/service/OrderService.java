package com.fuse.coffeemanagement.service;

import com.fuse.coffeemanagement.dao.OrderRepository;
import com.fuse.coffeemanagement.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends BaseService<Order, Long> {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    protected JpaRepository<Order, Long> repository() {
        return orderRepository;
    }

}
