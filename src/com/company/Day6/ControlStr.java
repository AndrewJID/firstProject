package com.company.Day6;

import java.util.Scanner;

public class ControlStr {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }

    public static void testevenodd(int x) {
        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
            x++;
        }
    }
}
