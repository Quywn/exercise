package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex20 {
    public static final int MAX_SIZE = 10;
    public static void main(String[] args) {
        //Ex20. Dùng LinkedList<String> để lưu lịch sử tìm kiếm sản phẩm. Chỉ giữ tối đa 10 tìm kiếm gần nhất, nếu vượt quá thì xoá phần tử cũ nhất.
        List<String> productList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"));
        String newSearch = "newSearch";
        productList.addFirst(newSearch);
        if (productList.size() >= MAX_SIZE) {
            productList.removeLast();
        }

        System.out.println(productList);

    }

}
