package com.example.importantquestions.TwoPointer;
import java.util.*;
public class MaxPointsfromCards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
        maxpoints(arr,k);
    }
    public static void maxpoints(int[] arr,int k){
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k-1;i++){
            lsum=lsum+arr[i];
        }
        maxsum=lsum;
        int rindex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-arr[i];
        }
    }

}
