package kiosk;

import kiosk.product.Product;

public class MenuList {


    public void printMenu(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i].getName()
                    + " - " + products[i].getPrice());
            if (i == products.length - 1) {
                System.out.println(products.length + 1 + ". " + "뒤로 가기");
            }
        }
        System.out.print(">> ");
    }
}
