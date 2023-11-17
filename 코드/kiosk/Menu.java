package kiosk;

import kiosk.product.Coffee;
import kiosk.product.Dessert;
import kiosk.product.NonCoffee;
import kiosk.product.Product;

public class Menu {
    private Product[] coffees;
    private Product[] nonCoffees;
    private Product[] desserts;

    public Menu() {
        coffees = new Coffee[3];
        coffees[0] = new Coffee("아메리카노", 1500);
        coffees[1] = new Coffee("라떼", 2000);
        coffees[2] = new Coffee("모카", 2500);

        nonCoffees = new NonCoffee[3];
        nonCoffees[0] = new NonCoffee("스무디", 3500);
        nonCoffees[1] = new NonCoffee("에이드", 3500);
        nonCoffees[2] = new NonCoffee("프라페", 3500);

        desserts = new Dessert[3];
        desserts[0] = new Dessert("아이스크림", 3000);
        desserts[1] = new Dessert("크룽지", 2500);
        desserts[2] = new Dessert("휘낭시에", 2500);
    }

    public Product[] getCoffees() {
        return coffees;
    }

    public Product[] getNonCoffees() {
        return nonCoffees;
    }

    public Product[] getDesserts() {
        return desserts;
    }
}
