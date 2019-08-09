package com.dbserver;

public class Vote {

    private String name = new String();
    private String restaurant = new String();
    private float data;
    private float hora;


    public Vote(String name, String restaurant, float data, float hora) {
        this.name = name;
        this.restaurant = restaurant;
        this.data = data;
        this.hora = hora;
    }

    public String getName() { return this.name; }

    public String getRestaurant() { return restaurant; }

    public float getData() { return data; }

    public float getHora() { return hora; }
}
