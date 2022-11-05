package com.company.day9;

import java.util.Scanner;

public class GreatestArr {
    public static void main(String[] args) {
        greatArr();

    }
    public static void greatArr(){
        int arr[] = new int[5];
        int max=0;
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter marks");
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Highest number = " +max);

    }
}
