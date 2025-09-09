package Assigned2.level2;

import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaInches = areaCm / 6.4516;

        System.out.printf("The area of the triangle in sq cm is %.2f and in sq in is %.2f%n", areaCm, areaInches);

        sc.close();
    }
}
