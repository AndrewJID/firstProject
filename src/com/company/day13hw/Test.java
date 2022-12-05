package com.company.day13hw;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i;
    int j=1;
        while(j!=0) {
            System.out.println("Choose option ");
            System.out.println("1.Break");
            System.out.println("0. Quit");
            j = sc.nextInt();
            if (j == 1) {
                System.out.println("Enter Option for Cars");
                System.out.println("1.Honda");
                System.out.println("2.Bmw");
                System.out.println("3.Audi");
                System.out.println("Enter Option :");
                i = sc.nextInt();
                Car c;
                switch (i) {
                    case 1:
                        c = new Honda();
                        c.carBreak();
                        break;

                    case 2:
                        c = new Bmw();
                        c.carBreak();
                        break;

                    case 3:
                        c = new Audi();
                        c.carBreak();
                        break;

                    default:
                        System.out.println("Wrong input");
                }
            }
        }
    }
}
