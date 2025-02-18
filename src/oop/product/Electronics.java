package oop.product;

public class Electronics extends Product {
    private String brand;
    private String warranty;

    public Electronics(String name, double price, String category, int stock) {
        super(name, price, category, stock);
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
