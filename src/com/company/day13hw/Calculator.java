package com.company.day13hw;

import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {

        return a + b;
    }

    public static int subtract(int a, int b) {

        return a - b;
    }

    public static double multiply(double a, double b) {

        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static int modulo(double a, double b) {

        return (int) (a % b);
    }

    public static void main(String[] args) {
        int a, b;
        int j = 2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Option");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");


        while (j != 0) {

            System.out.println("Do you want to perform an operation");
            System.out.println("1.Yes");
            System.out.println("0.No");
            j = sc.nextInt();
            if (j == 1) {

                System.out.println("Choose Option");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                System.out.println("5.Modulus");

                int i = sc.nextInt();


                switch (i) {
                    case 1:
                        System.out.println("Enter first Number: ");
                        a = sc.nextInt();
                        System.out.println("Enter second Number: ");
                        b = sc.nextInt();
                        System.out.println("Answer is " + Calculator.add(a, b));
                        break;

                    case 2:
                        System.out.println("Enter first Number: ");
                        a = sc.nextInt();
                        System.out.println("Enter second Number: ");
                        b = sc.nextInt();
                        System.out.println("Answer is " + Calculator.subtract(a, b));
                        break;

                    case 3:
                        System.out.println("Enter first Number: ");
                        a = sc.nextInt();
                        System.out.println("Enter second Number: ");
                        b = sc.nextInt();
                        System.out.println("Answer is " + Calculator.multiply(a, b));
                        break;

                    case 4:
                        System.out.println("Enter first Number: ");
                        a = sc.nextInt();
                        System.out.println("Enter second Number: ");
                        b = sc.nextInt();
                        if(b==0)
                        {
                            System.out.println("Wrong input, please input again");
                            System.out.println("Enter second Number: ");
                            b = sc.nextInt();
                        }
                        System.out.println("Answer is " + Calculator.division(a, b));
                        break;

                    case 5:
                        System.out.println("Enter first Number: ");
                        a = sc.nextInt();
                        System.out.println("Enter second Number: ");
                        b = sc.nextInt();
                        System.out.println("Answer is " + Calculator.modulo(a, b));
                        break;

                    default:
                        System.out.println("Wrong input");
                }
            }
        }
        System.out.println("Thank you for using the Calculator");
    }
}
