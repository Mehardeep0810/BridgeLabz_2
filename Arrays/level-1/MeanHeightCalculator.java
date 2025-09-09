package Assigned2.Arrays.level1;

import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array and variables
        double[] heights = new double[11];
        double sum = 0.0;

        // Step 2: Get input from user
        System.out.println("Enter the heights of 11 football players (in cm or meters):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Step 3: Calculate mean
        double mean = sum / 11;

        // Step 4: Display result
        System.out.printf("\nMean height of the football team: %.2f\n", mean);

        sc.close();
    }
}