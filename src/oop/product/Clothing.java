package oop.product;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, String productId, double price, String category, int stock, String size, String material) {
        super(name, productId, price, category, stock);
        this.size = size;
        this.material = material;
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
