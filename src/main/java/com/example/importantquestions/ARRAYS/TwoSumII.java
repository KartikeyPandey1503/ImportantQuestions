package com.example.importantquestions.ARRAYS;
import java.util.*;
public class TwoSumII {
//Solved using Two Pointer v imp
    static List<Integer> twosum2(int[] arr, int target) {
        List<Integer> answer=new ArrayList<>();
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                answer.add(i+1);
                answer.add(j+1);
                break;
            }
            else if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }
        }
        return answer;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of characters in the array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        System.out.println(twosum2(a,target));
    }
}
