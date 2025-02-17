package datatype.ex06;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InterestBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền gửi (P): ");
        BigDecimal principal = scanner.nextBigDecimal();

        System.out.print("Nhập lãi suất hàng năm (r) dưới dạng phần trăm: ");
        BigDecimal interestRate = scanner.nextBigDecimal().divide(BigDecimal.valueOf(100));

        System.out.print("Nhập số năm (n): ");
        int years = scanner.nextInt();

        //A=P(1+r)n
        BigDecimal amount = principal.multiply(BigDecimal.ONE.add(interestRate).pow(years));

        amount = amount.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Số tiền sau " + years + " năm là: A = " + amount);

        scanner.close();
    }
}
