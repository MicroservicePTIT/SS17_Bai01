package com.example.bai01.controller;

import com.example.bai01.model.Dish;
import com.example.bai01.service.DishService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
public class DishController {

    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<Dish> getDishes(@PathVariable Long restaurantId) {
        return dishService.getDishesByRestaurantId(restaurantId);
    }
}
