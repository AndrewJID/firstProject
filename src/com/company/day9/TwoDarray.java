package com.company.day9;

import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        total2Arr();
    }
    public static void total2Arr() {
        int [] arr[] = {
                {1,2,3,4,6},
                {3,6,5,4,3},
                {2,4,5,6,7}
        };
        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println("Total of Student ="+sum);
        }
    }
}
