package collection;

import oop.product.Product;

import java.util.*;

public class ProductServiceDemo {
    public static void main(String[] args) {
        List<Product> products = new DataTest().initProducts();

        //Ex1. Lưu danh sách sản phẩm, thêm, xoá và hiển thị danh sách sản phẩm.
        Product pizza = new Product("Pizza", "BO5",6, "Fast Food", 1);
        products.add(pizza);
        products.add(pizza);
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
        LinkedList<Product> cartLinkedList = new LinkedList<>(products);
        cartLinkedList.add(pizza);
        cartLinkedList.remove(pizza);
        System.out.println("Sản phẩm đầu tiên trong giỏ hàng: "+ cartLinkedList.getFirst());
        System.out.println("Sản phẩm cuối cùng trong giỏ hàng: "+ cartLinkedList.getLast());

        //Ex6. Dùng Hash set Loại bỏ sản phẩm trùng lặp trong danh sách
        HashSet<Product> setProduct = new HashSet<>(products);
        System.out.println("Danh sách sản phẩm (không bị trùng lặp):");
        System.out.println(setProduct);

        //Ex8. Lưu sản phẩm theo danh mục bảng chữ cái
        TreeSet<Product> treeSetA_Z = new TreeSet<>(products);
        System.out.println("Danh mục sản phẩm trong hệ thống (theo thứ tự bảng chữ cái):" + treeSetA_Z);

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
        HashMap<Product, Integer> cartHashMap = new HashMap<>();
        for (Product p : products) {
            if (cartHashMap.containsKey(p)) {
                cartHashMap.put(p, cartHashMap.get(p) + 1);
            } else {
                cartHashMap.put(p, 1);
            }
        }
        System.out.println("Lưu HashMap sản phẩm và số lượng:"+ cartHashMap);

        //Ex15. Sử dụng TreeMap<Double, List<Product>> để lưu sản phẩm theo giá, giúp lấy danh sách sản phẩm theo khoảng giá nhanh hơn.
        TreeMap<Double, List<Product>> treeMapPrice = new TreeMap<>();
        for (Product p : products) {
            treeMapPrice.computeIfAbsent(p.getPrice(), listP -> new ArrayList<>()).add(p);
        }
        System.out.println("Danh sách sản phẩm từ 1$ đến 3$: "+treeMapPrice.subMap(1.0, 3.0));

        //Ex19. Dùng Map<String, Set<String>> để lưu danh mục con của mỗi danh mục cha. Ví dụ: {"Điện tử" -> {"Điện thoại", "Laptop"}}.
        Map<String, Set<String>> indexCategory = new HashMap<>();
        for (Product p : products) {
            indexCategory.computeIfAbsent(p.getCategory(), set -> new HashSet<>()).add(p.getName());
        }
        System.out.println("Danh sách sản phẩm theo danh mục: " + indexCategory);
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