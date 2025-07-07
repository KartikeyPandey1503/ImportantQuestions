package com.example.importantquestions.ARRAYS;
import java.util.*;
public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        System.out.print(searchinrsa(a,target));
    }
    public static int searchinrsa(int[] a,int target){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==target){
                return mid;
            }
            if(a[left]<=a[mid]){
                if(target<a[left] || target>a[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
                if(target>a[right] || target<a[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }
}
