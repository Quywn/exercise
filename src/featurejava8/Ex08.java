package featurejava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Cho một danh sách số nguyên, hãy sử dụng Stream kết hợp với Optional để tìm số chẵn đầu tiên.
Nếu không có số chẵn nào, hiển thị thông báo phù hợp. Sử dụng stream(), filter(), findFirst() và isPresent().*/
public class Ex08 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 5, 7, 9, 11));
        Optional<Integer> firstEven = list.stream().filter(x -> x % 2 == 0).findFirst();
        if (firstEven.isPresent()) {
            System.out.println("First Even Number: " + firstEven.get());
        } else {
            System.out.println("No Even Number");
        }
    }
}
