package com.example.fooddelivery.service;

import java.util.List;

import com.example.fooddelivery.model.FoodItem;

public interface FoodItemService {
    FoodItem addFoodItem(FoodItem foodItem);

    FoodItem updateFoodItem(FoodItem foodItem);

    void deleteFoodItem(Long foodItemId);

    FoodItem getFoodItemById(Long foodItemId);

    List<FoodItem> getAllFoodItems();
}
