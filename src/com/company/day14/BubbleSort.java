package com.company.day14;

public class BubbleSort {
    public static void main(String[] args) {
        int arr1[]={7,5,3,7,4};
        int temp;
        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=0;j<arr1.length-i-1;j++)
            {
                if(arr1[j+1]<arr1[j])
                {
                    temp=arr1[j+1];
                    arr1[j+1]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}
