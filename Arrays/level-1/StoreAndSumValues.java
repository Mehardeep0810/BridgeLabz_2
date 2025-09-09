package Assigned2.Arrays.level1;

import java.util.Scanner;

public class StoreAndSumValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");
        while (true) {
            double input = sc.nextDouble();

            if (input <= 0) {
                break; 
            }

            if (index == 10) {
                break;
            }

            values[index] = input;
            index++;
        }

        System.out.println("\nEntered values:");
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
            total += values[i];
        }

    
        System.out.println("\nTotal sum of entered values: " + total);

        sc.close();
    }
}