package collection;

import oop.user.User;
import java.util.HashSet;
import java.util.List;

public class UserServiceDemo {
    public static void main(String[] args) {
        //Ex7. Dùng HashSet<User> để quản lý danh sách khách hàng đăng ký. Kiểm tra một email đã tồn tại trong danh sách chưa.
        List<User> users = new DataTest().initUsers();
        HashSet<User> usersSet = new HashSet<>(users);
        String email = "quyenvtn";
        boolean existEmail = usersSet.stream()
                .anyMatch(user -> user.getEmail().equals("email"));
        System.out.println("Email "+ email +"đã tồn tại (T/F): "+ existEmail );

        //Ex14. Dùng HashMap<User, List<Review>> để quản lý danh sách đánh giá của từng người dùng.


    }
}
