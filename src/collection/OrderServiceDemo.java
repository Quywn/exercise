package collection;

import oop.Order;

import java.util.HashMap;
import java.util.LinkedList;

public class OrderServiceDemo {
    public static void main(String[] args) {
        //Ex9. Dùng LinkedHashSet<Order> để lưu các đơn hàng đã hoàn thành theo thứ tự đặt hàng.
        LinkedList<Order> completedOrders = new LinkedList<>(new DataTest().initCompletedOrders());
        System.out.println("Các đơn hàng đã hoàn thành theo thứ tự đặt hàng:" + completedOrders);

        //Ex12. Đếm số lần khách hàng mua hàng
        HashMap<String, Integer> usersBuyCount = new HashMap<>();
        for (Order o : completedOrders) {
            if (usersBuyCount.containsKey(o.getUser())) {
                usersBuyCount.put(o.getUser(), usersBuyCount.get(o.getUser()) + 1);
            } else {
                usersBuyCount.put(o.getUser(), 1);
            }
        }
        System.out.println("Thống kê số lần khách hàng mua hàng:" + usersBuyCount);

        //Ex16. Sử dụng Map<Order, List<Product>> để lưu danh sách sản phẩm của mỗi đơn hàng.
        //Ex17. Dùng Map<User, Integer> để lưu số lần mua hàng của mỗi khách hàng, viết phương thức tìm khách hàng có số đơn hàng nhiều nhất.

    }
}
