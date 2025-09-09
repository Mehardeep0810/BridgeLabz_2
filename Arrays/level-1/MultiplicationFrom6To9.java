package Assigned2.Arrays.level1;

import java.util.Scanner;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Step 2: Define an array to store results for 6 to 9 (4 elements)
        int[] multiplicationResult = new int[4];

        // Step 3: Calculate and store results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Step 4: Display the results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}