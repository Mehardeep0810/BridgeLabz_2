package Assigned2.Arrays.level2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get number of students
        System.out.print("Enter the number of students: ");
        int count = sc.nextInt();

        // Step 2: Declare arrays
        int[][] marks = new int[count][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[count];
        String[] grades = new String[count];

        // Step 3: Input marks with validation
        for (int i = 0; i < count; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
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

            // Step 5: Assign grade
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
        for (int i = 0; i < count; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}