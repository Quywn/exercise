package oop;

import oop.product.Product;


public class Discount {

    double applyDiscount(Product product, double percent) {
        return product.getPrice() * percent / 100;
    }

    double applyBulkDiscount(Cart cart, double limitPrice, double percent) {
        if (cart.getTotalPrice(cart.getProducts()) > limitPrice) {
            return cart.getTotalPrice(cart.getProducts()) * percent / 100;
        }
        return cart.getTotalPrice(cart.getProducts());
    }
}
