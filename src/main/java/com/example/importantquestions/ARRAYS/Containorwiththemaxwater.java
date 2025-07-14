package com.example.importantquestions.ARRAYS;
import java.util.*;
public class Containorwiththemaxwater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(containorwmax(a));//Two pointer se karenge 0(n) me
    }
    public static int containorwmax(int[] a){
        int max=0;
        int left=0;
        int right=a.length-1;
        while(left<right){
            int width=right-left;
            int area=width*Math.min(a[left],a[right]);
            max=Math.max(max,area);
            if(a[left]<a[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

}
