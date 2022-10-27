package com.company.Day5;

import static java.lang.Math.abs;

public class CheckNumber {

    public static void main(String[] args) {
        int x = 15;
        if (x >=10 && x<=20) {
            System.out.println("Can take this ride " + x);
            x-=20;
            System.out.println(abs(x));
        }
    }
}