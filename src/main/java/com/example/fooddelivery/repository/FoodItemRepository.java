package com.example.fooddelivery.repository;

import com.example.fooddelivery.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    // Add custom queries if needed
}
