package datatype.ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập điểm sinh viên: ");
            double score = scanner.nextDouble();
            scanner.nextLine();

            Student student = new Student(name, score);
            students.add(student);
        }

        System.out.println("Thông tin sinh viên và học lực:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
