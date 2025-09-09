package Assigned2.Arrays.level1;

import java.util.Scanner;

public class OperationOnElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[15];

        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is positive and even.");
                } else {
                    System.out.println(arr[i] + " is positive and odd.");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative.");
            } else {
                System.out.println(arr[i] + " is zero.");
            }
        }
            if(arr[0]<arr[5]){
                System.out.println(arr[0]+" is less than "+arr[5]);
            }
            else if(arr[0]>arr[5]){
                System.out.println(arr[0]+" is greater than "+arr[5]);
            }
            else{
                System.out.println(arr[0]+" is equal to "+arr[5]);
            }
        sc.close();
    }
}