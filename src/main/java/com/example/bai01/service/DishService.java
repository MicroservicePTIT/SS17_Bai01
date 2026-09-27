package com.example.bai01.service;

import com.example.bai01.model.Dish;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DishService {

    @Cacheable(value = "dishesByRestaurant", key = "#restaurantId")
    public List<Dish> getDishesByRestaurantId(Long restaurantId) {
        System.out.println("--> [DB Query] Fetching dishes from Database for restaurantId: " + restaurantId);
        return Arrays.asList(
                new Dish(1L, restaurantId, "Phở Bò Đặc Biệt", 55000.0),
                new Dish(2L, restaurantId, "Bún Chả Hà Nội", 60000.0)
        );
    }
}
