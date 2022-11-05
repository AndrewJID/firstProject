package com.company.day9;

public class TwoDArrayCol {
    public static void main(String[] args) {
        colSum();
    }

    public static void colSum() {
        int total;
        int[][] arr = {{1,2,3,4,6}, {3,6,5,4,3}, {2,4,5,6,7}};
        for (int i = 0; i < arr[0].length; i++) {
            total=0;
            for (int j = 0; j < arr.length; j++) {
                total += arr[j][i];
            }
            System.out.println("Total marks of each subject =" +total);
        }
    }
}
