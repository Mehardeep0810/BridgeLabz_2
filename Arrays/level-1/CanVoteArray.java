package Assigned2.Arrays.level1;

import java.util.Scanner;
public class CanVoteArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the elements of array");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]>=18){
                System.out.println("Person with age "+arr[i]+" is eligible to vote");
            }
            else{
                System.out.println("Person with age "+arr[i]+" is not eligible to vote");
            }
        }
        sc.close();
    }
}
