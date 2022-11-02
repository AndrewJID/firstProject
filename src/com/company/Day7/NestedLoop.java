package com.company.Day7;

public class NestedLoop {
    public static void main(String[] args) {
        irLoop();
    }

    public static void irLoop() {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
