package Assigned2.level3;

import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter an integer to check if it's a Harshad Number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int originalNumber = number;  // Preserve the original number
        int sum = 0;                  // To store sum of digits

        // Step 3: Loop through each digit
        while (number != 0) {
            int digit = number % 10;     // Get last digit
            sum += digit;                // Add digit to sum
            number = number / 10;        // Remove last digit
        }

        if (originalNumber % sum == 0) {
            System.out.println("✅ " + originalNumber + " is a Harshad Number.");
        } else {
            System.out.println("❌ " + originalNumber + " is NOT a Harshad Number.");
        }
        sc.close();
    }
}