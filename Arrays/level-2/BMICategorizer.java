package Assigned2.Arrays.level2;

import java.util.Scanner;

public class BMICategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int count = sc.nextInt();

        double[] weights = new double[count];
        double[] heights = new double[count];
        double[] bmis = new double[count];
        String[] statuses = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight (in kg): ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height (in meters): ");
            heights[i] = sc.nextDouble();

            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Weight and height must be positive.");
                i--; 
                continue;
            }

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight 🟨";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal 🟩";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight 🟧";
            } else {
                statuses[i] = "Obese 🟥";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }

        sc.close();
    }

}
