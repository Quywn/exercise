package oop;

import oop.product.Product;

import java.util.Date;

public class Review {
    private String user;
    private Product product;
    private int rating;
    private String content;
    private Date created_at;

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
}
