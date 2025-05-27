package com.example.importantquestions.DPpattern;
import java.util.*;
public class MinCostClimbingStairs {
    static int climbingstairs(int[] cost){
        int first=cost[0];
        int second=cost[1];
        for(int i=2;i<cost.length;i++){
            int temp=cost[i]+Math.min(first,second);
            first=second;
            second=temp;

        }
        return Math.min(first,second);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of stairs:");
        int n=sc.nextInt();
        System.out.println("Enter cost associated with each step");
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        System.out.println(climbingstairs(cost));
    }
}
