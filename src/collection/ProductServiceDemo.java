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
        ArrayList<Product> products = new ArrayList<>();
        products.add(hamburger);
        products.add(hamburger);
        products.add(lemon);
        products.add(2,meat);
        products.add(bread);
        products.add(bread);
        products.add(lemon);
        products.add(lemon);
        products.add(lemon);
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
        System.out.println("Danh sách sản phẩm (không bị trùng lặp):");
        System.out.println(setProduct);

        //7. Dùng HashSet<User> để quản lý danh sách khách hàng đăng ký. Kiểm tra một email đã tồn tại trong danh sách chưa.

        //8. Lưu sản phẩm theo danh mục bảng chữ cái

        //9. Dùng LinkedHashSet<Order> để lưu các đơn hàng đã hoàn thành theo thứ tự đặt hàng.

        //10. Sử dụng Set<Product> để lưu danh sách yêu thích của khách hàng. Check 1 sản phẩm có trong ds hay không

        //11. Dùng HashMap<String, Integer> để lưu số lượng sản phẩm theo mã sản phẩm (productID).

        //12. Dùng HashMap<String, Integer> để đếm số lần khách hàng đã mua hàng.

        //13. Sử dụng HashMap<Product, Integer> để lưu giỏ hàng với sản phẩm và số lượng.

        //14. Dùng HashMap<User, List<Review>> để quản lý danh sách đánh giá của từng người dùng.

        //15. Sử dụng TreeMap<Double, List<Product>> để lưu sản phẩm theo giá, giúp lấy danh sách sản phẩm theo khoảng giá nhanh hơn.

        //16. Sử dụng Map<Order, List<Product>> để lưu danh sách sản phẩm của mỗi đơn hàng.

        //17. Dùng Map<User, Integer> để lưu số lần mua hàng của mỗi khách hàng, viết phương thức tìm khách hàng có số đơn hàng nhiều nhất.

        //18. Dùng HashMap<Product, Integer> để đếm số lần sản phẩm được đặt hàng. Trả về danh sách 5 sản phẩm được mua nhiều nhất.

        //19. Dùng Map<String, Set<String>> để lưu danh mục con của mỗi danh mục cha. Ví dụ: {"Điện tử" -> {"Điện thoại", "Laptop"}}.

        //20. Dùng LinkedList<String> để lưu lịch sử tìm kiếm sản phẩm. Chỉ giữ tối đa 10 tìm kiếm gần nhất, nếu vượt quá thì xoá phần tử cũ nhất.

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