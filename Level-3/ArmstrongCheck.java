package Assigned2.level3;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to check if it's an Armstrong number: ");
        int number = sc.nextInt();

        int originalNumber = number;  // Preserve the original number
        int sum = 0;                  // To store sum of cubes of digits

        while (originalNumber != 0) {
            int digit = originalNumber % 10;      // Get last digit
            sum += digit * digit * digit;         // Add cube of digit to sum
            originalNumber = originalNumber / 10; // Remove last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}
    
