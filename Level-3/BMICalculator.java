package Assigned2.level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100.0;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output
        System.out.printf("Your BMI is %.2f%n", bmi);
        System.out.println("Health Status: " + status);

        sc.close();
    }
}