package collection;

import oop.product.Product;

import java.util.*;

public class ProductServiceDemo {
    public static void main(String[] args) {
        Product hamburger = new Product("Hamburger", 3, "Fast Food", 1);
        Product lemon = new Product("Lemon juice", 1, "Drink", 1);
        Product bread = new Product("Bread", 1, "Fast Food", 1);
        Product meat = new Product("Meat", 5, "Food", 1);

        //1. Lưu danh sách sản phẩm, thêm, xoá và hiển thị danh sách sản phẩm.
        ArrayList<Product> products = (ArrayList<Product>) Arrays.asList(hamburger, lemon, bread, meat);
        products.add(hamburger);
        products.add(new Product("Pizza", 6, "Fast Food", 1));
        products.remove(lemon);
        System.out.println("Danh sách sản phẩm:");
        System.out.println(products);

        //2. Viết phương thức duyệt ArrayList<Product> và trả về sản phẩm có giá cao nhất.
        System.out.println("Sản phẩm có giá cao nhất:");
        System.out.println(maxPriceProduct(products));

        //3.Viết phương thức lấy tất cả sản phẩm thuộc một danh mục cụ thể từ ArrayList<Product>.
        System.out.println("Danh sách tất cả sản phẩm thuộc danh mục Fast Food:");
        System.out.println(filterByCategory(products, "Fast Food"));

        //4. Sử dụng Collections.sort() và Comparator để sắp xếp danh sách sản phẩm theo giá.
        System.out.println("Danh sách sản phẩm theo giá tăng dần:");
        System.out.println(sortedByPrice(products));

        //5. Quản lý giỏ hàng bằng LinkedList
        LinkedList<Product> cart = new LinkedList<>(products);
        cart.remove(bread);
        System.out.println("Sản phẩm đầu tiên trong giỏ hàng: "+ cart.getFirst());
        System.out.println("Sản phẩm cuối cùng trong giỏ hàng: "+ cart.getLast());

        //6. Dùng Hash set Loại bỏ sản phẩm trùng lặp trong danh sách
        HashSet<Product> setProduct = new HashSet<>(products);
        System.out.println(setProduct);

    }

    public static Product maxPriceProduct(List<Product> products) {
        Product maxPriceProduct = null;
        for (Product product : products) {
            if (maxPriceProduct == null) {
                maxPriceProduct = product;
            }
        }
        return maxPriceProduct;
    }

    public static List<Product> filterByCategory(List<Product> products, String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public static List<Product> sortedByPrice(List<Product> products) {
        Collections.sort(products, new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return products;
    }
}