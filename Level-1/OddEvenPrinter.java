package Assigned2.level1;

import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for valid natural number
        if (number >= 1) {
            // Iterate from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
        sc.close();
    }
}