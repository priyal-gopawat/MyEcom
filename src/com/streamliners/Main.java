package com.streamliners;

import com.streamliners.models.*;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        Cart cart = new Cart();

        String optionsMenu ="====================================="+
                "\nSelect your choice from the given ones" +
                "\n\n0: Exit" +
                "\n1: Add product to shop" +
                "\n2: Edit product in shop" +
                "\n3: Delete product from shop" +
                "\n4: See all products in shop" +
                "\n\n5: Add product to cart" +
                "\n6: Edit product in cart" +
                "\n7: Remove product from cart" +
                "\n8: Get Cart details" +
                "\n9: Place Order" +
                "\n====================================="+
                "\nEnter your choice: ";

        while (true){
            System.out.print(optionsMenu);
            int n = sc.nextInt();

            switch (n){
                case 0:
                    System.out.println("Thank You!");
                    return;

                case 1:
                    shop.add();
                    break;

                case 2:
                    shop.edit();
                    break;

                case 3:
                    shop.deleteProduct();
                    break;

                case 4:
                    System.out.println(shop);
                    break;

                case 5:
                    cart.add(shop);
                    break;

                case 6:
                    cart.edit(cart);
                    break;

                case 7:
                    cart.remove(cart);
                    break;

                case 8:
                    System.out.println(cart);
                    break;

                case 9:
                    System.out.println(Colors.CYAN+"Order Placed Successfully"+Colors.RESET);

            }
        }

    }
}
