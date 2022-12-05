package com.company.hw;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        int employeeId;
        String employeeName;
        String emailId;
        Employee e1 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employeeID");
        e1.setEmployeeId(sc.nextInt());
        System.out.println("Enter Employee Name");
        e1.seteName(sc.next());
        System.out.println("Enter Employee Email");
        emailId=sc.next();
        while(Employee.Validate(emailId)!=true)
        {
            System.out.println("Please enter valid Email Address");
            emailId=sc.next();
        }
        e1.seteEmail(emailId);
        System.out.println(e1.toString());
    }



}
