package com.example.importantquestions.ARRAYS;
import java.util.*;
public class ThreeSumClosest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of elements in an array");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println(threesumclosest(target,a));

    }
    static int threesumclosest(int target,int[] a){
        Arrays.sort(a);
        if(a.length<3)
            return -1;
        if(a.length==3)
            return (a[0]+a[1]+a[2]);
        int closest=Integer.MAX_VALUE;
        for(int k=0;k<a.length-2;k++){
            int i=k+1;
            int j=a.length-1;
            while(i<j){
                int sum=a[k]+a[i]+a[j];
                if(Math.abs(sum-target)<Math.abs(closest-sum)){
                    closest=sum;
                }
                if(sum<target){
                    i++;
                }else if(sum>target){
                    j--;
                }
            }
        }


    return closest;
        }

    }

