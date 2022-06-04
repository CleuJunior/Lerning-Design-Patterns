package main.java;

import main.java.controller.CreditCardAlgorithm;
import main.java.controller.PaypalAlgorithm;
import main.java.controller.ShoppingCart;
import main.java.model.Product;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 100);
        Product shirt = new Product("847", 43);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //  Payment decisions
        cart.pay(new PaypalAlgorithm("john-doe@gmail.com", "45554321"));

        cart.pay(new CreditCardAlgorithm("jane-doe@outlook.com", "45554322"));

    }
}
