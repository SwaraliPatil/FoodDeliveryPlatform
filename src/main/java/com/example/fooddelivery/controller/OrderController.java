package com.example.fooddelivery.controller;

import com.example.fooddelivery.model.FoodItem;
import com.example.fooddelivery.model.Order;
import com.example.fooddelivery.model.User;
import com.example.fooddelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/place-order")
    public Order placeOrder(@RequestParam User userId, @RequestParam FoodItem foodItemId, @RequestParam int quantity) {
        return orderService.placeOrder(userId, foodItemId, quantity);
    }

    @GetMapping("/user/{userId}/orders")
    public List<Order> getOrderByUserId(@PathVariable Long userId) {
        return orderService.getOrderByUserId(userId);
    }
}
