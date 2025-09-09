package Assigned2.level1;

import java.util.Scanner;

public class FactorialWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number >= 1) {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
        sc.close();
    }
    
}
