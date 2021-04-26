package com.streamliners.models;

public class WeightBasedProduct extends Product{
    float pricePerKg,minQty; //pricePerKg and minOty of the product

    //Initializing Parameterized Constructor of the WeightBasedProduct
    public WeightBasedProduct(String name, String imageUrl, float pricePerKg, float minQty) {
        super(name, imageUrl);
        this.pricePerKg = pricePerKg;
        this.minQty = minQty;
    }

    @Override
    public String toString() {
        return "WeightBasedProduct{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", pricePerKg=" + pricePerKg +
                ", minQty=" + minQty +
                '}';
    }
}
