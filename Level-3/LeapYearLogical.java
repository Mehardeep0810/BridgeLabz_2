package Assigned2.level3;

import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Gregorian calendar check
        if (year < 1582) {
            System.out.println("The year " + year + " is not valid for Gregorian calendar leap year check.");
        } else {
            // Leap year logic using one if statement
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " IS a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }
        sc.close();
    }
}
