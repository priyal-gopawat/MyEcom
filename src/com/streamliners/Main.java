package com.streamliners;

import com.streamliners.models.Product;
import com.streamliners.models.Variant;
import com.streamliners.models.VariantsBasedProducts;
import com.streamliners.models.WeightBasedProduct;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creating an Object apple of class WeightBasedProduct
        WeightBasedProduct apple = new WeightBasedProduct("Apple","",100,2);

        //Creating a list of Variants for Our VariantBasedProduct
        List<Variant> variants = new ArrayList<>(
                Arrays.asList(new Variant("500g Packet",90), new Variant("1kg Packet",180))
        );
        
        //Creating a object kiwi of class VariantBasedProduct
        VariantsBasedProducts kiwi = new VariantsBasedProducts("Kiwi","",variants);
        System.out.println(apple);
        System.out.println(kiwi);
    }
}

