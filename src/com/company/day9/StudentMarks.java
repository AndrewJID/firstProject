package com.company.day9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        sumMarks();
    }
    public static void sumMarks(){
        int arr[] = new int[5];
        int total=0;
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter marks");
            arr[i]=sc.nextInt();
            total+=arr[i];

        }
        System.out.println("Total Marks = "+total);
    }
}
