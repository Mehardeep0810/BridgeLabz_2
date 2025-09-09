package Assigned2.Arrays.level2;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get number of persons
        System.out.print("Enter the number of persons in the team: ");
        int number = sc.nextInt();

        // Step 2: Declare 2D array and status array
        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        // Step 3: Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);

            // Input height
            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Step 4: Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine weight status based on chart
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight 🟨";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal 🟩";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight 🟧";
            } else {
                weightStatus[i] = "Obese 🟥";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}