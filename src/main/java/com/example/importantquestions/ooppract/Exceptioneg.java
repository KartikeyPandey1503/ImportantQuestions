package com.example.importantquestions.ooppract;

public class Exceptioneg {
    public static void main(String args[]){
        System.out.println("One");
        System.out.println("Two");
        try{
            System.out.println("before exception");
            int a = 1 / 0;
            System.out.println("after exception");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception");
        }

        System.out.println("One");

    }
}
