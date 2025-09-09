package Assigned2.level3;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        sc.close();

        if (number == 0) {
            System.out.println("The number of digits is 1");
            return;
        }
        number = Math.abs(number);

        int count = 0;

        // Loop to count digits
        while (number != 0) {
            number = number / 10; // Remove last digit
            count++;              // Increment digit count
        }

        System.out.println("The number of digits is: " + count);

        sc.close();
    }
}