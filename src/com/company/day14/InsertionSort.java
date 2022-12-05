package com.company.day14;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={7,5,3,7,4};
        int j=0;
        int current;
        for(int i=1;i<arr.length;i++)
        {
            current=arr[i];
            j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
