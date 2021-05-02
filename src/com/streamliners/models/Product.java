package com.streamliners.models;

import java.util.List;

public class Product {
     //Common
     public String name,imageUrl;
     public int type;

     //WBP
     public float minQty,pricePerKg;

     //VBP
     public  List<Variant> variants;

    /**
     * parametrized constructor for WB
     * @param name  contains name of the product
     * @param imageUrl contains image of the product
     * @param minQty contains minQty to purchase
     * @param pricePerKg contains pricePerKg of the product
     */
    public Product(String name, String imageUrl,float minQty,float pricePerKg) {
        type = ProductType.TYPE_WB;
        this.name = name;
        this.imageUrl = imageUrl;
        this.minQty = minQty;
        this.pricePerKg=pricePerKg;
    }

    /**
     * parametrized constructor for VB
     * @param name contains name of the product
     * @param imageUrl contains image of the product
     * @param variants
     */
    public Product(String name, String imageUrl, List<Variant> variants) {
        type = ProductType.TYPE_VB;
        this.name = name;
        this.imageUrl = imageUrl;
        this.variants=variants;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (type == ProductType.TYPE_WB)
            builder.append("WB { ");
        else
            builder.append("VB { ");
        builder.append("name = ").append(name);

        if (type == ProductType.TYPE_WB) {
            builder.append(" , minQty = ").append(minQty);
            builder.append(" , pricePerKg = ").append(pricePerKg);
        } else
            builder.append(" , variants = ").append(variants);

        builder.append(" } ");

        return builder.toString();
    }
}
