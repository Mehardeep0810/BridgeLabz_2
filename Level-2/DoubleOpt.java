package Assigned2.level2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a (double): ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b (double): ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c (double): ");
        double c = sc.nextDouble();

        // Perform operations with double precision
        double result1 = a + b * c;       // Multiplication before addition
        double result2 = a * b + c;       // Multiplication before addition
        double result3 = c + a / b;       // Division before addition
        double result4 = a % b + c;       // Modulus before addition

        // Output results
        System.out.println("The results of Double Operations are:");
        System.out.printf("a + b * c = %.4f%n", result1);
        System.out.printf("a * b + c = %.4f%n", result2);
        System.out.printf("c + a / b = %.4f%n", result3);
        System.out.printf("a %% b + c = %.4f%n", result4); // %% to escape % in printf

        sc.close();
    }
}
