package com.dbserver;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vote {

    private String name;
    private String restaurant;
    private LocalDate data;
    private LocalTime time;


    public Vote(String name, String restaurant, LocalDate data, LocalTime time) {
        this.name = name;
        this.restaurant = restaurant;
        this.data = data;
        this.time = time;
    }

    public String getName() { return this.name; }

    public String getRestaurant() { return restaurant; }

    public LocalDate getData() { return data; }

    public LocalTime getTime() { return time; }
}
