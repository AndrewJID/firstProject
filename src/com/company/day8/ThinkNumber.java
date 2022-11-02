package com.company.day8;

import java.util.Scanner;

public class ThinkNumber {
    public static void main(String[] args) {
        checkNo();
    }

    public static void checkNo() {
        int thoughtNumber = (int) (Math.random() * 100), guessedNumber;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Keep Guessing");
            guessedNumber = sc.nextInt();

            if (guessedNumber < thoughtNumber) {
                if ((thoughtNumber - guessedNumber) < 10) {
                    System.out.println("Guessed Number is little lower");
                } else {
                    System.out.println("Guesssed Number is lower");
                }
            } else {
                if ((guessedNumber - thoughtNumber) < 10) {
                    System.out.println("Guessed Number is little higher");
                } else {
                    System.out.println("Guesssed Number is higher");
                    System.out.println("Thank You");
                    System.out.println("Vivek status");
                }
            }

        }
        while (thoughtNumber != guessedNumber);
        System.out.println("You guessed right");
    }
}
