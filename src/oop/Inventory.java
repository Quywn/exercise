package oop;

import oop.product.Product;


public class Inventory {

    int check_stock(Product product) {
        return product.getStock();
    }

    Product restock(Product product, int quantity) {
        if (quantity > 0) {
            product.setStock(quantity);
            System.out.println("Restocked " + quantity + " of " + product.getName() + ". Total stock: " + product.getStock());
            return product;
        } else {
            System.out.println("Quantity to restock must be greater than 0.");
            return product;
        }
    }

    void deduct_stock(Order order) {

        order.getOrderedProductsList()
                .forEach((product, quantity) -> {
                    if (product.getStock() > quantity) {
                        product.setStock(product.getStock() - quantity);
                        System.out.println("Deducted +"+quantity+"+ of " + product.getName() + ". Total stock: " + product.getStock());
                    } else {
                        System.out.println("Failed to deduct stock. Not enough inventory for product: " + product);
                    }
                });
    }
}
