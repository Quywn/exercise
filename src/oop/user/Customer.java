package oop.user;

import java.util.Arrays;
import java.util.List;

public class Customer extends User{
    public Customer(String username, String email, String password, List<String> permissions) {
        super(username, email, password, Arrays.asList("BUY_PRODUCTS", "WRITE_REVIEWS"));
    }

    public void buyProduct(String product) {
        if (hasPermission("BUY_PRODUCTS")) {
            System.out.println("Buying product: " + product);
        } else {
            System.out.println("Permission denied: Unable to buy products.");
        }
    }

    public void writeReview(String product, String review) {
        if (hasPermission("WRITE_REVIEWS")) {
            System.out.println("Writing review for " + product + ": " + review);
        } else {
            System.out.println("Permission denied: Unable to write reviews.");
        }
    }

    public void showRole() {
        System.out.println("Role: Customer");
    }
}
