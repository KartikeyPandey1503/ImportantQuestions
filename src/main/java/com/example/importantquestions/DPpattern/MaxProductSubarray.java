package com.example.importantquestions.DPpattern;

import java.util.Scanner;

public class MaxProductSubarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(getmaxprodsubarray(a));
    }
    public static int getmaxprodsubarray(int[] a){
        if(a.length==0)
            return 0;
        int min=a[0];
        int max=a[0];
        int result=max;
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int temp=Math.max(curr,Math.max(curr*min,curr*max));
            min=Math.min(curr,Math.min(curr*min,curr*max));
            max=temp;

            result=Math.max(result,temp);
        }
        return result;
    }
}
