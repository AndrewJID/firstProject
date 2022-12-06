package com.company.timshortons;
import java.util.Scanner;

public class TestingMain {
    public static void main(String[] args) {
        int arrayCounter=0;
        int arrayListLimit=0;
        String paymentInput;
        double total=0;
        //String arr1[]= new String[10];
        TimsItems arr[]=new TimsItems[10];
        TimsItems timsitems;
        Payment payment=new Payment();
        Scanner sc = new Scanner(System.in);
        int input = 1;
        while (input != 0) {
            System.out.println("Please choose category of Order");
            System.out.println("1. Tims Merchandise");
            System.out.println("2. Tims Consumable");
            System.out.println("3.Go to Checkout");
            System.out.println("0. Quit");
            input = sc.nextInt();
            if (input == 1) {
                System.out.println("Please find below Merchandise");
                System.out.println("1.Mugs - 5$");
                System.out.println("2.Coffee Powder - 2$");
                input = sc.nextInt();
                System.out.println("1.Add Item");
                System.out.println("2.Go Back");
                switch(input)
                {
                    case 1:
                        timsitems = new Mugs();
                        System.out.println(timsitems.getFeature());
                        System.out.println("Price of Mug is " + timsitems.getPrice() + "$");
                        input=sc.nextInt();
                        if(input==1) {
                            arr[arrayCounter]= new Mugs();
                            total=total+arr[arrayCounter].getPrice();
                            arrayListLimit=arrayCounter;
                            arrayCounter++;
                        }
                        break;
                    case 2:
                        timsitems = new CoffeePowder();
                        System.out.println(timsitems.getFeature());
                        System.out.println("Price of Coffee Powder is " + timsitems.getPrice() + "$");
                        input=sc.nextInt();
                        if(input==1) {
                            arr[arrayCounter]=new CoffeePowder();
                            total=total+arr[arrayCounter].getPrice();
                            arrayListLimit=arrayCounter;
                            arrayCounter++;
                        }
                        break;
                }
            }
            else if(input==2)
            {
                System.out.println("Please find below Merchandise");
                System.out.println("1.Donut - 5$");
                System.out.println("2.Bagel - 4$");
                input=sc.nextInt();
                System.out.println("1.Add Item");
                System.out.println("2.Go Back");
                switch(input)
                {
                    case 1:
                        timsitems = new Donut();
                        System.out.println("Number of Calories "+timsitems.getCalories());
                        System.out.println("Price of Donut is " + timsitems.getPrice() + "$");
                        input=sc.nextInt();
                        if(input==1) {
                            arr[arrayCounter]=new Donut();
                            total=total+arr[arrayCounter].getPrice();
                            arrayListLimit=arrayCounter;
                            arrayCounter++;
                        }
                        break;
                    case 2:
                        timsitems = new Bagel();
                        System.out.println("Number of Calories "+timsitems.getCalories());
                        System.out.println("Price of Bagel is " + timsitems.getPrice() + "$");
                        input=sc.nextInt();
                        if(input==1) {
                            arr[arrayCounter]=new Bagel();
                            total=total+arr[arrayCounter].getPrice();
                            arrayListLimit=arrayCounter;
                            arrayCounter++;
                        }
                        break;
                }
            }
            else if(input==3 && total!=0)
            {

                System.out.println("Your cart list below");
                for(int i=0;i<=arrayListLimit;i++)
                {
                    System.out.println(arr[i].getItemName());
                }
                System.out.println("Your Total Cart Amount is " +total +"$");
                System.out.println("1.Proceed to Payment");
                System.out.println("2.Add More to your cart");
                System.out.println("0.Cancel Order");
                input=sc.nextInt();
                if(input==1)
                {
                    System.out.println("Please enter card Number (15 digits)");
                    paymentInput=sc.next();
                    while(!payment.validateCardNumber(paymentInput))
                    {
                        System.out.println("Please enter valid card Number (15 digits)");
                        paymentInput=sc.next();
                    }
                    payment.setCardNumber(paymentInput);
                    System.out.println("Please enter Expiry Date (MM/YY)");
                    paymentInput=sc.next();
                    while(!payment.validateExpiryDate(paymentInput))
                    {
                        System.out.println("Please enter valid Expiry Date (MM/YY)");
                        paymentInput=sc.next();
                    }
                    payment.setExpiryDate(paymentInput);
                    System.out.println("Please enter CVV (3 Digits)");
                    paymentInput=sc.next();
                    while(!payment.validateCvv(paymentInput))
                    {
                        System.out.println("Please enter valid CVV (3 Digits)");
                        paymentInput=sc.next();
                    }
                    payment.setCvv(paymentInput);
                    if(payment.customerBalance(total))
                    {
                        System.out.println("Order Placed,Thank You for Ordering");
                    }
                    else
                    {
                        System.out.println("Insufficient funds");
                    }
                }
                else if(input==0)
                {
                    System.out.println("Order Cancelled");
                }
            }
            else if (input==3 && total==0) {
                System.out.println("Cart is empty");
            }
        }
    }
}
