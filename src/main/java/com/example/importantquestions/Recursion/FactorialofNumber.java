package com.example.importantquestions.Recursion;
import java.util.Scanner;
public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
       System.out.println( factorial(n));
       //nth fibonacci
        System.out.println(fibonacci(n));
        //printing a string in reverse
        System.out.println("Enter a string and index");
        String s = in.next();
        int index=in.nextInt();
        reverse(s, index);
    }
    public static long factorial(int n) {
        if(n<=1)
            return 1;
        return n*factorial(n-1);
    }
    public static void reverse(String s, int index) {
        if(index>=s.length())
            return;
        reverse(s, index+1);
        System.out.println(s.charAt(index));
    }
    public static int fibonacci(int n){
        if(n==0 || n==1 || n==2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
