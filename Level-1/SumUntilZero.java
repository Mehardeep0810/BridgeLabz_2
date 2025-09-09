package Assigned2.level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double input;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        // Loop until user enters 0
        while (true) {
            input = sc.nextDouble();

            if (input == 0.0) {
                break;
            }

            total += input;
        }

        sc.close();
        System.out.println("The total sum is: " + total);
    }
}
