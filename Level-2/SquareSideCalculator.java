package Assigned2.level2;

import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        if (perimeter > 0) {
            double side = perimeter / 4;
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        } else {
            System.out.println("Perimeter must be a positive value.");
        }
        sc.close();
    }
}
