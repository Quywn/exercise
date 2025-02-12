package oop;

import oop.product.Product;

import java.util.Date;

public class Review {
    private String user;
    private Product product;
    private String rating; //Todo: Pattern: 1 -> 5
    private String content;
    private Date created_at; //Todo: format date?

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
