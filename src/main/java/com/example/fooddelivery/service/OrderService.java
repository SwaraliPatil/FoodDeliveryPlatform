package com.example.fooddelivery.service;

import java.util.List;

import com.example.fooddelivery.model.FoodItem;
import com.example.fooddelivery.model.Order;
import com.example.fooddelivery.model.User;

public interface OrderService {
    Order placeOrder(User userId, FoodItem foodItemId, int quantity);

    List<Order> getOrderByUserId(Long userId);

}
