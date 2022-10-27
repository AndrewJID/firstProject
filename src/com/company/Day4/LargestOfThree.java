package com.company.Day4;

public class LargestOfThree {

    public static void main(String[] args) {
        int a=5,b=3,c=8;
        largestSmallest(a,b,c);
    }
    public static void largestSmallest(int x,int y,int z) {
        if (x > y && x > z) {
            System.out.println("The first number is the greatest " + x);
        } else if (y > x && y > z) {
            System.out.println("The second number is the greatest " + y);
        } else if (z > x && z > y) {
            System.out.println("The Third number is the greatest " + z);
        }
        if (x < y && x < z) {
            System.out.println("The first number is the Smallest " + x);
        } else if (y < x && y < z) {
            System.out.println("The second number is the Smallest " + y);
        } else if (z < x && z < y) {
            System.out.println("The Third number is the Smallest " + z);
        }
    }
};

