package Assigned2.level2;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: a, b, c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Integer operations demonstrating precedence
        int result1 = a + b * c;       // Multiplication happens before addition
        int result2 = a * b + c;       // Multiplication before addition again
        int result3 = c + a / b;       // Division before addition
        int result4 = a % b + c;       // Modulus before addition

        // Output
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        sc.close();
    }
}