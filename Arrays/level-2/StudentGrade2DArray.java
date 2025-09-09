package Assigned2.Arrays.level2;

import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get number of students
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        // Step 2: Declare 2D array for marks and arrays for percentage and grade
        int[][] marks = new int[number][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[number];
        String[] grades = new String[number];

        // Step 3: Input marks with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = switch (j) {
                    case 0 -> "Physics";
                    case 1 -> "Chemistry";
                    case 2 -> "Maths";
                    default -> "Unknown";
                };

                System.out.print("Enter marks for " + subject + ": ");
                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                    j--; // Retry current subject
                    continue;
                }

                marks[i][j] = mark;
            }

            // Step 4: Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Step 5: Assign grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
