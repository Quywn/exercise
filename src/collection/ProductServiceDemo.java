package collection;

import oop.product.Product;

import java.util.*;

public class ProductServiceDemo {
    public static void main(String[] args) {
        List<Product> products = new DataTest().initProducts();

        //Ex1. Lưu danh sách sản phẩm, thêm, xoá và hiển thị danh sách sản phẩm.
        Product pizza = new Product("Pizza", "BO5",6, "Fast Food", 1);
        products.add(pizza);
        products.remove(products.size()-2);
        System.out.println("Danh sách sản phẩm:");
        System.out.println(products);

        //Ex2. Viết phương thức duyệt ArrayList<Product> và trả về sản phẩm có giá cao nhất.
        System.out.println("Sản phẩm có giá cao nhất:");
        System.out.println(maxPriceProduct(products));

        //Ex3.Viết phương thức lấy tất cả sản phẩm thuộc một danh mục cụ thể từ ArrayList<Product>.
        System.out.println("Danh sách tất cả sản phẩm thuộc danh mục Fast Food:");
        System.out.println(filterByCategory(products, "Fast Food"));

        //Ex4. Sử dụng Collections.sort() và Comparator để sắp xếp danh sách sản phẩm theo giá.
        System.out.println("Danh sách sản phẩm theo giá tăng dần:");
        System.out.println(sortedByPrice(products));

        //Ex5. Quản lý giỏ hàng bằng LinkedList
        LinkedList<Product> cart = new LinkedList<>(products);
        cart.add(pizza);
        cart.remove(pizza);
        System.out.println("Sản phẩm đầu tiên trong giỏ hàng: "+ cart.getFirst());
        System.out.println("Sản phẩm cuối cùng trong giỏ hàng: "+ cart.getLast());

        //Ex6. Dùng Hash set Loại bỏ sản phẩm trùng lặp trong danh sách
        HashSet<Product> setProduct = new HashSet<>(products);
        System.out.println("Danh sách sản phẩm (không bị trùng lặp):");
        System.out.println(setProduct);

        //Ex8. Lưu sản phẩm theo danh mục bảng chữ cái
        TreeSet<Product> treeSet = new TreeSet<>(products);
        System.out.println("Danh mục sản phẩm trong hệ thống (theo thứ tự bảng chữ cái):" + treeSet);

        //Ex10. Sử dụng Set<Product> để lưu danh sách yêu thích của khách hàng. Check 1 sản phẩm có trong ds hay không
        Set<Product> favoriteSet = new HashSet<>(products);
        String nameProductToCheck = "Hamburger";
        boolean exist = favoriteSet.stream().anyMatch(product -> product.getName().equals(nameProductToCheck));
        System.out.println("Sản phẩm "+ nameProductToCheck +"đã tồn tại trong danh sách sản phẩm yêu thích (T/F): "+ exist );


        //Ex11. Dùng HashMap<String, Integer> để lưu số lượng sản phẩm còn trong kho theo mã sản phẩm (productID).
        HashMap<String, Integer> productQuantity = new HashMap<>();
        for (Product p : products) {
            productQuantity.put(p.getProductId(), p.getStock());
        }
        System.out.println("Số lượng sản phẩm còn trong kho theo mã sản phẩm: " + productQuantity);

        //Ex13. Sử dụng HashMap<Product, Integer> để lưu giỏ hàng với sản phẩm và số lượng.


        //Ex15. Sử dụng TreeMap<Double, List<Product>> để lưu sản phẩm theo giá, giúp lấy danh sách sản phẩm theo khoảng giá nhanh hơn.

        //Ex18. Dùng HashMap<Product, Integer> để đếm số lần sản phẩm được đặt hàng. Trả về danh sách 5 sản phẩm được mua nhiều nhất.

        //Ex19. Dùng Map<String, Set<String>> để lưu danh mục con của mỗi danh mục cha. Ví dụ: {"Điện tử" -> {"Điện thoại", "Laptop"}}.

        //Ex20. Dùng LinkedList<String> để lưu lịch sử tìm kiếm sản phẩm. Chỉ giữ tối đa 10 tìm kiếm gần nhất, nếu vượt quá thì xoá phần tử cũ nhất.

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