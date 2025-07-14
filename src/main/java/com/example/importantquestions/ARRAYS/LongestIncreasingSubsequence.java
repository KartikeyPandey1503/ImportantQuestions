package com.example.importantquestions.ARRAYS;
import java.util.*;
public class LongestIncreasingSubsequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.printf("Enter the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(lengthofLIS(arr));
    }
    public static int lengthofLIS(int[] arr) {
        int[] lis=new int[arr.length];
        Arrays.fill(lis, 1);
        int max=1;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    lis[i]=Math.max(lis[i],lis[j]+1);//Reaccurance relation in dynamic programming
                    max=Math.max(max,lis[i]);
                }
            }
        }
    return max;
    }
}
