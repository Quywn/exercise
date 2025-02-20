package oop;

import oop.product.Product;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Order {
    private String orderId;
    private String user;
    private List<Product> products;
    private Map<Product, Integer> orderedProductsList;
    private double totalPrice;
    private Status status;
    private LocalDateTime orderDatetime;

    public Order(String orderId, String user, List<Product> products, double totalPrice, Status status, LocalDateTime orderDatetime) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = status;
        this.orderDatetime = orderDatetime;
    }

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

    public LocalDateTime getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(LocalDateTime orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", user='" + user + '\'' +
                ", products=" + products +
                ", orderedProductsList=" + orderedProductsList +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", orderDatetime=" + orderDatetime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(totalPrice, order.totalPrice) == 0 && Objects.equals(orderId, order.orderId) && Objects.equals(user, order.user) && Objects.equals(products, order.products) && Objects.equals(orderedProductsList, order.orderedProductsList) && status == order.status && Objects.equals(orderDatetime, order.orderDatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, user, products, orderedProductsList, totalPrice, status, orderDatetime);
    }
}
