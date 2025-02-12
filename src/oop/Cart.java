package oop;

import oop.product.Product;

import java.util.List;

public class Cart {
    private List<Product> products;
    List<Product> addProduct(Product product) {
        products.add(product);
        return products;
    }
    List<Product> getProducts() {
        return products;
    }
    List<Product> removeProduct(Product product) {
        products.remove(product);
        return products;
    }

    Double getTotalPrice(List<Product> products) {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }


}
