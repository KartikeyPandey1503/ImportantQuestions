package com.example.importantquestions.ARRAYS;
import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(maxsubarray(a));
    }
    public static int maxsubarray(int[] a){
        int curr=0;
        int maxsum=a[0];
        for(int i=0;i<a.length;i++){
            if(curr<0)
                curr=0;
            curr=curr+a[i];
            maxsum=Math.max(maxsum,curr);
        }
        return maxsum;
    }

}
