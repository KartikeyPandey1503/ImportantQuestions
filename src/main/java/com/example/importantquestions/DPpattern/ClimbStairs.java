package com.example.importantquestions.DPpattern;
import java.util.*;
public class ClimbStairs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(climbstairs(n));
    }
    public static int climbstairs(int n) {
        if (n == 1) return 1;
        int one=1;
        int two=2;
        for(int i=3;i<=n;i++){
            int total=one +two;
            one=two;
            two=total;
        }
        return two;
    }
}
