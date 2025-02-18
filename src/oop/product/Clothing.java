package oop.product;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String category, int stock) {
        super(name, price, category, stock);
    }


    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", category='" + super.getCategory() + '\'' +
                ", stock=" + super.getStock() +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

}
