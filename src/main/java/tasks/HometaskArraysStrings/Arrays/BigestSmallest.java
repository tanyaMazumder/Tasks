package tasks.HometaskArraysStrings.Arrays;

import java.util.Scanner;

public class BigestSmallest {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int minimum, maximum;
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        minimum = arr[0];
        maximum = arr[0];
        for(int i=0; i<n; i++){
            if(minimum > arr[i]){
                minimum = arr[i];
            }

            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        System.out.print("\nThe smallest number in the array is: " +minimum);
        System.out.print("\nThe largest number in the array is: " +maximum);
    }
}
