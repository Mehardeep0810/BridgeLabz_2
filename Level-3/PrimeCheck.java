package Assigned2.level3;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println("✅ " + number + " is a Prime Number.");
        } else {
            System.out.println("❌ " + number + " is NOT a Prime Number.");
        }
        sc.close();
    }
}
