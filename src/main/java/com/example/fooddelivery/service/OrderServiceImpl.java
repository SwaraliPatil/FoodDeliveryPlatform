package com.example.fooddelivery.service;

import com.example.fooddelivery.model.FoodItem;
import com.example.fooddelivery.model.Order;
import com.example.fooddelivery.model.User;
import com.example.fooddelivery.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order placeOrder(User userId, FoodItem foodItemId, int quantity) {
        Order order = new Order();
        order.setUser(userId);
        order.setFoodItem(foodItemId);
        order.setQuantity(quantity);
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrderByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
