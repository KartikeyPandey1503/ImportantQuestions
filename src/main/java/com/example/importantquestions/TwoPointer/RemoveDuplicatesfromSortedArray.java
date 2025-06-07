package com.example.importantquestions.TwoPointer;

import java.util.Scanner;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        //i will always be a unique element and j will get i another
        int nums=arr.length;
        int i=0,j=1;
        while(j<nums){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        System.out.println(i+1);
        for(int k=0;k<i+1;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

