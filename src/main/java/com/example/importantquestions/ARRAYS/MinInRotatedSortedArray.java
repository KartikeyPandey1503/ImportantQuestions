package com.example.importantquestions.ARRAYS;
import java.util.*;
public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the sorted rotated array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.print( mininsorted(arr));

    }
    public static int mininsorted(int[] a) {
        int left = 0;
        int right = a.length - 1;
        int ans = a[0];
        if (a.length == 1) {
            return a[0];
        }
        while (left < right) {
            if (a[left] < a[right]) {
                ans = Math.min(ans, a[left]);
            }
            int mid = (left + right) / 2;
            ans = Math.min(ans, a[mid]);
            if (a[left] <= a[mid]) {
                left = mid + 1;
            } else
                right = mid - 1;

        }
        return ans;
    }}

/*
this logic passed all the testcases in leetcode
class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans=nums[0];
        if(nums.length==1)
            return nums[0];
        while(left<right){
            if(nums[left]<nums[right])
                ans=Math.min(ans,nums[left]);
            int mid=(left+right)/2;
            ans=Math.min(ans,nums[mid]);
            if (nums[mid] > nums[right])
                left=mid+1;
            else
                right=mid;
        }
    return nums[left];
    }
}
 */