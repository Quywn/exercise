package oop.user;

import java.util.Arrays;
import java.util.List;

public class Admin extends User {
    public Admin(String username, String email, String password, List<String> permissions) {
        super(username, email, password, Arrays.asList("MANAGE_PRODUCTS", "MANAGE_ORDERS"));
    }

    public void manageProducts() {
        if (hasPermission("MANAGE_PRODUCTS")) {
            System.out.println("Managing products...");
        } else {
            System.out.println("Permission denied: Unable to manage products.");
        }
    }

    public void manageOrders() {
        if (hasPermission("MANAGE_ORDERS")) {
            System.out.println("Managing orders...");
        } else {
            System.out.println("Permission denied: Unable to manage orders.");
        }
    }

    public void showRole() {
        System.out.println("Role: Admin");
    }
}
