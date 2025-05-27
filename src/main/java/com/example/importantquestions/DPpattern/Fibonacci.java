package com.example.importantquestions.DPpattern;
import java.util.*;


public class Fibonacci {

    static List<Integer> fib(int n){
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for(int i=2;i<=n;i++){
            fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2));
        }
        return fibonacci;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
