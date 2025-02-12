package oop.product;

public class Electronics extends Product {
    private String brand;
    private String warranty;

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
