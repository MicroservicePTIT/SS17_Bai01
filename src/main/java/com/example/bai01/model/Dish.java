package com.example.bai01.model;

import java.io.Serializable;

public class Dish implements Serializable {
    private Long id;
    private Long restaurantId;
    private String name;
    private Double price;

    public Dish() {
    }

    public Dish(Long id, Long restaurantId, String name, Double price) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
