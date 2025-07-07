package com.example.importantquestions.ARRAYS;
import java.util.*;
public class BestTimeToBuyandSellStocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(besttimetobuyandsell(arr));
    }
    public static int besttimetobuyandsell(int[] arr){
        int min=arr[0];
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            profit=Math.max(profit,arr[i]-min);
        }
        return profit;
    }

}
