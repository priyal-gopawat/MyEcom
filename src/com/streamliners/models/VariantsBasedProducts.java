package com.streamliners.models;

import java.util.List;

public class VariantsBasedProducts extends Product {
    List<Variant> variants; //list of variants of the product

    //Initializing Parameterized Constructor of the VariantsBasedProduct
    public VariantsBasedProducts(String name, String imageUrl, List<Variant> variants) {
        super(name, imageUrl);
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "VariantsBasedProducts{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", variants=" + variants +
                '}';
    }
}
