package collection;

import oop.Order;
import oop.product.Product;
import oop.user.User;

import java.util.*;

public class OrderServiceDemo {
    public static void main(String[] args) {
        //Ex9. Dùng LinkedHashSet<Order> để lưu các đơn hàng đã hoàn thành theo thứ tự đặt hàng.
        LinkedList<Order> completedOrders = new LinkedList<>(new DataTest().initCompletedOrders());
        System.out.println("Các đơn hàng đã hoàn thành theo thứ tự đặt hàng:" + completedOrders);

        //Ex12. Đếm số lần khách hàng mua hàng
        HashMap<String, Integer> usersBuyCountKeyString = new HashMap<>();
        for (Order o : completedOrders) {
            if (usersBuyCountKeyString.containsKey(o.getUser().getUsername())) {
                usersBuyCountKeyString.put(o.getUser().getUsername(), usersBuyCountKeyString.get(o.getUser().getUsername()) + 1);
            } else {
                usersBuyCountKeyString.put(o.getUser().getUsername(), 1);
            }
        }
        System.out.println("Thống kê số lần khách hàng mua hàng:" + usersBuyCountKeyString);

        //Ex16. Sử dụng Map<Order, List<Product>> để lưu danh sách sản phẩm của mỗi đơn hàng.
        //ToDo: check có cần thiết dùng Map hay không do thiết kế Order đã có thuộc tính productList
        Map<Order, List<Product>> ordersByUser = new HashMap<>();
        for (Order o : completedOrders) {
            ordersByUser.computeIfAbsent(o, list -> o.getProducts());
        }
        System.out.println("Danh sách sản phẩm theo mỗi đơn hàng: " + ordersByUser);

        //Ex17. Dùng Map<User, Integer> để lưu số lần mua hàng của mỗi khách hàng, viết phương thức tìm khách hàng có số đơn hàng nhiều nhất.
        HashMap<User, Integer> usersBuyCount = new HashMap<>();
        for (Order o : completedOrders) {
            if (usersBuyCount.containsKey(o.getUser())) {
                usersBuyCount.put(o.getUser(), usersBuyCount.get(o.getUser()) + 1);
            } else {
                usersBuyCount.put(o.getUser(), 1);
            }
        }
        System.out.println("Khách hàng có số đơn nhiều nhất: " + findMostOrder(usersBuyCount).getUsername());

        //Ex18. Dùng HashMap<Product, Integer> để đếm số lần sản phẩm được đặt hàng. Trả về danh sách 5 sản phẩm được mua nhiều nhất.
        HashMap<Product, Integer> orderCount = new HashMap<>();
        for (Order o : completedOrders) {
            for (Map.Entry<Product, Integer> entry: o.getOrderedProductsList().entrySet()) {
                if (orderCount.containsKey(entry.getKey())) {
                    orderCount.put(entry.getKey(), orderCount.get(entry.getKey()) + entry.getValue());
                } else {
                    orderCount.put(entry.getKey(), 1);
                }
            }
        }
        System.out.println("Top 5 sản phẩm mua nhiều nhất " + top5Product(orderCount));
    }

    public static User findMostOrder(HashMap<User, Integer> usersBuyCount) {
        User mostOrderUser = null;
        int maxOrders = 0;

        for (Map.Entry<User, Integer> entry : usersBuyCount.entrySet()) {
            if (entry.getValue() > maxOrders) {
                maxOrders = entry.getValue();
                mostOrderUser = entry.getKey();
            }
        }
        return mostOrderUser;
    }

    public static List<Product> top5Product(HashMap<Product, Integer> orderCount) {
        List<Map.Entry<Product, Integer>> productList = new ArrayList<>(orderCount.entrySet());
        productList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        List<Product> top5Products = new ArrayList<>();

        for (int i = 0; i < Math.min(5, productList.size()); i++) {
            top5Products.add(productList.get(i).getKey());
        }

        return top5Products;
    }
}
