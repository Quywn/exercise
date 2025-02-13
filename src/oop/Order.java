package oop;

import oop.product.Product;

import java.util.List;
import java.util.Map;

public class Order {
    private String orderId;
    private String user;
    private List<Product> products;
    private Map<Product, Integer> orderedProductsList;
    private double totalPrice;
    private Status status;

    public Status updateStatus(Status status) {
        return this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public Map<Product, Integer> getOrderedProductsList() {
        return orderedProductsList;
    }

    public void setOrderedProductsList(Map<Product, Integer> orderedProductsList) {
        this.orderedProductsList = orderedProductsList;
    }
}
