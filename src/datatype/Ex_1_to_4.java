package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex_1_to_4 {

    public static void main(String[] args) {
        final double INCHES2METER = 0.0254;
        final int MINUTES_IN_A_DAY = 24 * 60;
        final int MINUTES_IN_A_YEAR = 365 * MINUTES_IN_A_DAY;

        //Exercise 01
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercise 01: Enter inches: ");
        int inches = scanner.nextInt();
        System.out.printf("%d inch(es) is equal to %.4f meters.%n", inches, inches * INCHES2METER);

        //Exercise 02
        System.out.println("Exercise 02: Enter minutes: ");
        long minutesTotal = scanner.nextLong();
        System.out.printf("%d minutes ~ %d years and %d days.%n", minutesTotal, minutesTotal / MINUTES_IN_A_YEAR, minutesTotal % MINUTES_IN_A_YEAR / MINUTES_IN_A_DAY);

        //Exercise 03
        System.out.println("Exercise 03: Enter a number: ");
        long number = scanner.nextLong();
        System.out.printf("The sorted digits of %d is %s.%n", number, number2SortedDigit(number));

        //Exercise 04
        System.out.println("Exercise 04: Enter distance (m): ");
        double distance = scanner.nextDouble();
        System.out.println("hours: ");
        int hours = scanner.nextInt();
        System.out.println("minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("seconds: ");
        int seconds = scanner.nextInt();

        int totalTimeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speedInMetersPerSecond = distance / totalTimeInSeconds;
        double speedInKilometersPerHour = (distance / 1000) / (totalTimeInSeconds / 3600.0);

        System.out.printf("Speed in m/s is %.8f%n", speedInMetersPerSecond);
        System.out.printf("Speed in km/h is %.8f%n", speedInKilometersPerHour);

        scanner.close();

    }

    public static List<Character> number2SortedDigit(long number) {
        String numberString = String.valueOf(number);
        char[] digits = numberString.toCharArray();
        Arrays.sort(digits);
        List<Character> sortedDigits = new ArrayList<>();

        for (char digit : digits) {
            sortedDigits.add(digit);
        }
        return sortedDigits;

    }
}
