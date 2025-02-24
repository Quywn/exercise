package featurejava8;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1_6 {
    public static void main(String[] args) {
//        Ex01. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        List<String> listString = new ArrayList<>(Arrays.asList("Asg", "Cany", "Cann", "Dora", "Em", "Fi", "Go", "Hoy"));
        System.out.println("Ex1. List String: "+ listString);
        System.out.println("-> ListString to uppercase: " + convertToUp(listString));
        System.out.println("-> ListString to lowercase: " + convertToLow(listString));

//        Ex02. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Ex2. List uppercase: " + listInteger);
        System.out.println("Sum of all even numbers = "+ sumEven(listInteger)+", sum of all odd numbers = "+ sumOdd(listInteger));

//        Ex03. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        System.out.println("Ex3. List String: "+ listString);
        System.out.println("-> ascending: "+ sortedAsc(listString));
        System.out.println("-> descending: "+ sortedDesc(listString));

//        Ex04. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        System.out.println("Ex4. List Integer: "+ listInteger);
        System.out.println("Second smallest element: "+ findSecondSmallest(listInteger));
        System.out.println("Second largest element: "+ findSecondLargest(listInteger));

//        Ex05. Cho một danh sách các chuỗi, hãy dùng groupingBy để nhóm chúng lại theo độ dài của chuỗi.
        System.out.println("Ex5. List String: "+ listString);
        System.out.println("Nhóm theo độ dài chuỗi: "+ groupByLength(listString));

//        Ex06. Cho một danh sách các chuỗi, hãy dùng joining nối tất cả chúng lại thành một chuỗi duy nhất, phân cách nhau bởi dấu phẩy.
        System.out.println("Ex6. List String: "+ listString);
        System.out.println("Chuỗi được nối: "+ joinStringList(listString));
    }

    public static List<String> convertToLow(List<String> listString) {
        return listString.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
    }

    public static List<String> convertToUp(List<String> listString) {
        return listString.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
    }

    public static Integer sumEven(List<Integer> list) {
        Integer sum = 0;
        List<Integer> listEven = list.stream().filter(x -> x % 2 == 0).toList();
        for (Integer integer : listEven) {
            sum += integer;
        }
        return sum;
    }

    public static Integer sumOdd(List<Integer> list) {
        Integer sum = 0;
        List<Integer> listOdd = list.stream().filter(x -> x % 2 == 1).toList();
        for (Integer integer : listOdd) {
            sum += integer;
        }
        return sum;
    }

    public static List<String> sortedAsc(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static List<String> sortedDesc(List<String> list) {
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static Integer findSecondSmallest(List<Integer> list) {
        return list.stream().sorted().toList().get(1);
    }

    public static Integer findSecondLargest(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
    }

    public static Map<Integer, List<String>> groupByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length));
    }
    public static String joinStringList(List<String> list) {
        return list.stream().collect(Collectors.joining(","));
    }
}
