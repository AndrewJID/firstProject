package com.company.day14;

public class TestMain {
    public static void main(String[] args) {
        Address address=new Address("Winston Churchil","intersection of Thomas Street","L84M34");
        Student student=new Student(1001,"Andrew","Dsouza",address,
                "4356755343","andrew@gmail.com");
        System.out.println(student.toString());
    }
}
