package oop;

import oop.product.Product;
import oop.user.User;

import java.time.LocalDateTime;
import java.util.Date;

public class Review {
    private User user;
    private Product product;
    private int rating;
    private String content;
    private LocalDateTime created_at;

    public Review(User user, Product product, int rating, String content, LocalDateTime created_at) {
        this.user = user;
        this.product = product;
        this.rating = rating;
        this.content = content;
        this.created_at = created_at;
    }

    //Trong Spring dùng @Pattern
    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5!");
        }
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Review{" +
                "user='" + user + '\'' +
                ", product=" + product +
                ", rating='" + rating + '\'' +
                ", content='" + content + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getRating() {
        return rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
