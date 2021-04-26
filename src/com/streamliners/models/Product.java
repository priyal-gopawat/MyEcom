package com.streamliners.models;

public class Product {
    String name,imageUrl;  //contains name and imageUrl of the product.

    //Initializing Parameterized Constructor for Product
    public Product(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

}
