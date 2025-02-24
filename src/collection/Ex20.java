package collection;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex20 {
    public static final int MAX_SIZE = 10;
    public static void main(String[] args) {
        //Ex20. Dùng LinkedList<String> để lưu lịch sử tìm kiếm sản phẩm. Chỉ giữ tối đa 10 tìm kiếm gần nhất, nếu vượt quá thì xoá phần tử cũ nhất.
        LinkedList<String> productList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"));
        String newSearch = "newSearch";
        if (isOverdose(productList)) {
            productList.removeLast();
            productList.addFirst(newSearch);
        } else {
            productList.add(newSearch);
        }
        System.out.println(productList);
    }

    static boolean isOverdose(List<String> productList) {
        return productList.size() >= MAX_SIZE;
    }

}
