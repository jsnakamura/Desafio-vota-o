package com.dbserver;

public class Vote {

    private String name = new String();
    private String restaurant = new String();
    private float data;
    private float hora;


    public Vote(String name, String restaurant) {
        this.name = name;
        this.restaurant = restaurant;
    }

    public String getName() {
        return this.name;
    }

    public String getRestaurant() {
        return restaurant;
    }

}
