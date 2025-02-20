package oop.product;


import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private String productId;
    private double price;
    private String category;
    private int stock;

    public Product(String name, String productId, double price, String category, int stock) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && stock == product.stock && Objects.equals(name, product.name) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category, stock);
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
