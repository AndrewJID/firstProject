package com.company.Day6;

public class FiboSeries {

    public static void main(String[] args) {
        fiboSer(10);
    }
    public static void fiboSer(int count){
        int n1=0,n2=1,n3=0;
        System.out.println(n1);
        System.out.println(n2);
        for(int x=2;x<count;x++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
