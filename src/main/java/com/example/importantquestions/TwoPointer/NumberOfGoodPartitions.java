package com.example.importantquestions.TwoPointer;
import java.util.*;
public class NumberOfGoodPartitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(goodPartition(arr));
    }
    public static int goodPartition(int[] arr){
        int n=arr.length;
        Map<Integer,Integer> lastIndex=new HashMap<>();
        for(int i=0;i<n;++i){
            lastIndex.put(arr[i],i);
        }
        int i=0;
        int j=Math.max(0,lastIndex.get(arr[0]));

        int result=1;
        while(i<n){
            if(i>j){
                result=(result*2)%1000000007;
            }
            j=Math.max(j,lastIndex.get(arr[j]));
            i++;
        }
        return result;
    }
}
