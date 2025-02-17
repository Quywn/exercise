package datatype.ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên sinh viên: ");
            String name = scanner.nextLine();
            System.out.print("Điểm sinh viên: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            studentArrayList.add(new Student(name, gpa));
        }

        System.out.println("Danh sách sinh viên:");
        for (Student student : studentArrayList) {
            System.out.println(student.toString());
        }

        studentArrayList.sort((student1, sv2) -> Double.compare(sv2.getGpa(), student1.getGpa()));

        System.out.println("Sinh viên có điểm cao nhất: ");
        double gpaMax = studentArrayList.getFirst().getGpa();
        for (Student student : studentArrayList) {
            if (student.getGpa() == gpaMax) {
                System.out.println(student.toString());
            }
        }


        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm giảm dần:");
        for (Student student : studentArrayList) {
            System.out.println(student.toString());
        }
        scanner.close();

    }
}
