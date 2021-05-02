package com.streamliners.models;

import java.util.HashMap;

public class Cart {

   public HashMap<String, CartItem> cartItems = new HashMap<>();
    float total, noOfItems;

    /**
     * Adding weight based product to the cart
     * @param product
     * @param qty  qty to be added
     */
     public void add(Product product, float qty) {
        //If item already exist in cart
        if (cartItems.containsKey(product.name)) {
            total -= cartItems.get(product.name).cost();
            cartItems.get(product.name).qty = qty;
        }
        //Adding for the first time
        else {
            CartItem item = new CartItem(product.name, product.pricePerKg, qty);
            cartItems.put(product.name, item);
            noOfItems++;
        }
        total += product.pricePerKg * qty;
    }

    /**
     * Adding variant based product to the cart
     * @param product
     * @param variant variant to be added
     */
     public void add(Product product, Variant variant) {
        String key = product.name + " " + variant.name;
        //Already exist
        if (cartItems.containsKey(key)) {
            cartItems.get(key).qty++;
        }
        //Adding for thr first time
        else {
            CartItem item = new CartItem(product.name, variant.price,1);
            cartItems.put(key,item);
        }
        //update cart summary
        noOfItems++;
        total += variant.price;
    }

    /**
     * Removing product
     * @param product
     */
    public void remove(Product product){
         if(product.type==ProductType.TYPE_WB){
             removeWBP(product);
         } else{
             removeAllVariantsOfVBP(product);
         }

    }

    /**
     * Removing weight based product
     * @param product
     */
    private void removeWBP(Product product) {
        //update cart summary
        total -= cartItems.get(product.name).cost();
        noOfItems--;
        cartItems.remove(product.name);
    }

    /**
     * Removing all variants of VBP
     * @param product
     */
    public void removeAllVariantsOfVBP(Product product){
       for(Variant variant : product.variants){
           String key = product.name + " " + variant.name;

           if(cartItems.containsKey(key)){
               //update cart summary
               total -= cartItems.get(key).cost();
               noOfItems-= cartItems.get(key).qty;


               cartItems.remove(key);
           }
       }
    }

    /**
     * Decrement qty of variant
     * @param product
     * @param variant
     */
    public void decrement(Product product,Variant variant){
        String key = product.name + " " + variant.name;

        //Update qty
        cartItems.get(key).qty--;

        //Update cart summary
        total -= variant.price;
        noOfItems--;

        //Remove if qty=0
        if( cartItems.get(key).qty==0)
            cartItems.remove(key);

    }



    @Override
    public String toString() {
        return cartItems.values()
                +String.format("\n total %f items (Rs.%f)",noOfItems,total);
    }
}
