package com.example.importantquestions.TwoPointer;
import java.util.*;
public class NumberofSubsequenceSatisfyingSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter target");
        int target=sc.nextInt();
        int l=0,r=n-1;
        int res=0;
        while(l<r){
            if(a[l]+a[r]<=target){
                res= (int) (res+Math.pow(2,r-l));
                l++;
            }else{
                r--;
            }
        }
        System.out.println(res);





          
    }
}
