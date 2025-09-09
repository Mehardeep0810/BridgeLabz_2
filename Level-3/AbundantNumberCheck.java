package Assigned2.level3;

import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to check if it's an Abundant Number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Step 3: Loop through all numbers less than 'number'
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    sc.close();
    }
}