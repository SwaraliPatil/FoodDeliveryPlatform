package com.example.fooddelivery.controller;

import com.example.fooddelivery.model.FoodItem;
import com.example.fooddelivery.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/food-items")
public class FoodItemController {
    private final FoodItemService foodItemService;

    @Autowired
    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @PostMapping
    public ResponseEntity<FoodItem> addFoodItem(@RequestBody FoodItem foodItem) {
        FoodItem addedFoodItem = foodItemService.addFoodItem(foodItem);
        return new ResponseEntity<>(addedFoodItem, HttpStatus.CREATED);
    }

    @PutMapping("/{foodItemId}")
    public ResponseEntity<FoodItem> updateFoodItem(@PathVariable Long foodItemId,
            @RequestBody FoodItem updatedFoodItem) {
        FoodItem foodItem = foodItemService.getFoodItemById(foodItemId);
        if (foodItem == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        foodItem.setName(updatedFoodItem.getName());
        foodItem.setDescription(updatedFoodItem.getDescription());
        foodItem.setPrice(updatedFoodItem.getPrice());

        FoodItem updatedFoodItem1 = foodItemService.updateFoodItem(foodItem);
        return new ResponseEntity<>(updatedFoodItem1, HttpStatus.OK);
    }

    @DeleteMapping("/{foodItemId}")
    public ResponseEntity<Void> deleteFoodItem(@PathVariable Long foodItemId) {
        FoodItem foodItem = foodItemService.getFoodItemById(foodItemId);
        if (foodItem == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        foodItemService.deleteFoodItem(foodItemId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{foodItemId}")
    public ResponseEntity<FoodItem> getFoodItemById(@PathVariable Long foodItemId) {
        FoodItem foodItem = foodItemService.getFoodItemById(foodItemId);
        if (foodItem == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(foodItem, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<FoodItem>> getAllFoodItems() {
        List<FoodItem> foodItems = foodItemService.getAllFoodItems();
        if (foodItems.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(foodItems, HttpStatus.OK);
    }
}
