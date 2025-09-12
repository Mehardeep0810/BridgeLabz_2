package Assigned2.Arrays.level2;

import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return;
        }

    
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

    
        while (number != 0) {
            int digit = number % 10;
            digits[index++] = digit;
            number /= 10;

            if (index == maxDigit) {
                break; 
            }
        }

      
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "Not available"));

        sc.close();
    }

}
