package Assigned2.Arrays.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();

        int[] arr = new int[10];

        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = number * i;
        }

        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + arr[i - 1]);
        }

        sc.close();
    }
}