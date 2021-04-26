package com.streamliners.models;

public class Variant {
    String name; //name of variant
    float price; //price of variant

    //Initializing Parameterized Constructor for the variant
    public Variant(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
