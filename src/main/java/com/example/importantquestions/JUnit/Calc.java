package com.example.importantquestions.JUnit;

public class Calc {
    //one unit
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
    //another unit
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static void main(String args[]){
        Calc calc = new Calc();
        int result=calc.divide(10, 5);
        if(result==2)
            System.out.println("Test case passed");
        else
            System.out.println("Test case failed");
    }
}
