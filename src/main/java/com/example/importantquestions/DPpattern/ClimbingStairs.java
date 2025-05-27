package com.example.importantquestions.DPpattern;
import java.util.*;
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n==0 || n==1 || n==2 || n==3)
            return n;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n= sc.nextInt();
        System.out.println(climbStairs(n));
    }
}
