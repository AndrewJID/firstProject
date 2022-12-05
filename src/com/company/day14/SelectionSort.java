package com.company.day14;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={7,5,3,7,4};
        int temp,smallest;
        for(int i=0;i<arr.length;i++)
        {
            smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
