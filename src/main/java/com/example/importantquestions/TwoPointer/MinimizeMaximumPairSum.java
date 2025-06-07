package com.example.importantquestions.TwoPointer;
import java.util.*;
public class MinimizeMaximumPairSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array it should be even");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements into the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       System.out.println( minmaxpairsum(arr));

    }
    public static int minmaxpairsum(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int i=0,j=n-1;
        int result=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            result=Math.max(result,sum);
            i++;
            j--;

        }
        return result;
    }
}
