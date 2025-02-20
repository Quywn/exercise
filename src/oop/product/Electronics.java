package oop.product;

public class Electronics extends Product {
    private String brand;
    private String warranty;

    public Electronics(String name, String productId, double price, String category, int stock, String brand, String warranty) {
        super(name, productId, price, category, stock);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", category='" + super.getCategory() + '\'' +
                ", stock=" + super.getStock() +
                ", brand='" + brand + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}
