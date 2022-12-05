package com.company.day10;

public class ReturnNotString {
    public static void main(String[] args) {
        System.out.println(notString("dedellshow",2));
    }
    public static String notString(String str,int n)
    {
        String m="";
        for(int i=0;i<str.length();i=i+n)
        {
            m=m +str.charAt(i);
        }
        return m;
    }
}

