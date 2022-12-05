package day15;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestingMain {
    public static void main(String[] args) {
        int customerBalance=30;
        int firstInput=1;
        int secondInput;
        int thirdInput;
        int fourthInput;
        int fifthInput;
        int orderListCounter=0;
        int tracker=0;
        String orderList []=new String[10];
        TimsItems tm;
        int total=0;
        Scanner sc=new Scanner(System.in);
        while(firstInput!=0)
        {
            System.out.println("Please choose category of Order");
            System.out.println("1. Tims Merchandise");
            System.out.println("2. Tims Consumable");
            System.out.println("3.Go to Checkout");
            System.out.println("0. Quit");
            firstInput=sc.nextInt();
            if(firstInput==1)
            {
                tm=new TimsMerchandise();
                System.out.println("Please find below Merchandise");
                System.out.println("1.Mugs - 5$");
                System.out.println("2.Coffee Powder - 2$");
                System.out.println("3.Gift Cards - 10$");
                System.out.println("4.Hockey Cards - 1$");
                secondInput=sc.nextInt();
                tm.getPrice(secondInput);
                TimsMerchandise.getFeature(secondInput);
                System.out.println("1.Add Item");
                System.out.println("2.Go Back");
                thirdInput=sc.nextInt();
                if(thirdInput==1)
                {
                    total+=tm.addItem(secondInput);
                    orderList[orderListCounter]=tm.toString(secondInput);
                    tracker=orderListCounter;
                    orderListCounter++;
                }
                else if(thirdInput==2)
                {
                    continue;
                }
            }
            else if(firstInput==2)
            {
                tm=new TimsConsumable();
                System.out.println("Please find below Merchandise");
                System.out.println("1.Donut - 5$");
                System.out.println("2.Bagel - 4$");
                System.out.println("3.Coffee - 2$");
                System.out.println("4.Wrap - 8$");
                System.out.println("5.Sandwich - 10$");
                secondInput=sc.nextInt();
                tm.getPrice(secondInput);
                TimsConsumable.getCalories(secondInput);
                System.out.println("1.Add Item");
                System.out.println("2.Go Back to Main Menu");
                thirdInput=sc.nextInt();
                if(thirdInput==1)
                {
                    total+=tm.addItem(secondInput);
                    orderList[orderListCounter]=tm.toString(secondInput);
                    tracker=orderListCounter;
                    orderListCounter++;
                }
                else if(secondInput==2)
                {
                    continue;
                }
            }
            if(firstInput==3)
            {
                if(total==0)
                {
                    System.out.println("Your Cart is empty");

                }
                else {
                    System.out.println("Your Cart list below");
                    for(int i=0;i<=tracker;i++)
                    {
                        System.out.println(orderList[i]);
                    }
                    System.out.println("Your total Cart Value " +total +"$");
                    System.out.println("1. Proceed to Payment");
                    System.out.println("0 Cancel Order");
                    fourthInput=sc.nextInt();
                    if(fourthInput==0)
                    {
                        firstInput=0;
                    }
                    else if(fourthInput==1)
                    {
                        System.out.println("Please enter credit card number (15 digits)");
                        String creditCardNumber=sc.next();
                        Pattern pattern = Pattern.compile("^[0-9]{15}$");
                        Matcher matcher=pattern.matcher(creditCardNumber);
                        while(!matcher.find())
                        {
                            System.out.println("Please enter valid credit card number (15 digits)");
                            creditCardNumber=sc.next();
                            matcher=pattern.matcher(creditCardNumber);
                        }
                        System.out.println("Please enter expiry date (mm/yy)");
                        String expiryDate=sc.next();
                        pattern=Pattern.compile("^[0-9]{2}/[2-9][0-9]$");
                        matcher=pattern.matcher(expiryDate);
                        while(!matcher.find())
                        {
                            System.out.println("Please enter valid expiry date");
                            expiryDate=sc.next();
                            matcher=pattern.matcher(expiryDate);
                        }
                        System.out.println("Please enter CVV(3 digits)");
                        String cvv=sc.next();
                        pattern=Pattern.compile("^[0-9]{3}$");
                        matcher=pattern.matcher(cvv);
                        while(!matcher.find())
                        {
                            System.out.println("Please enter valid CVV(3 digits)");
                            cvv=sc.next();
                            matcher=pattern.matcher(cvv);
                        }
                        System.out.println("1 Make Payment");
                        System.out.println("2 Cancel Cart");
                        fifthInput=sc.nextInt();
                        if(fifthInput==1) {
                            if (total <= customerBalance) {
                                System.out.println("Order Placed , Thank You for Ordering");
                            }
                            else {
                                System.out.println("Insufficient funds");
                            }
                            firstInput=0;
                        }
                        else if(fifthInput==2)
                        {
                            System.out.println("Cart Cancelled");
                            firstInput=0;
                        }
                    }
                }
            }
        }
    }
}
