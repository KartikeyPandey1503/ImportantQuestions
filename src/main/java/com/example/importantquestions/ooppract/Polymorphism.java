package com.example.importantquestions.ooppract;

public class Polymorphism {
    // Nested Calculator class demonstrating method overloading
    public static class Calculator {
        // Method 1: Add two integers
        public static int sum(int a, int b) {
            return a + b;
        }

        // Method 2: Add three integers
        public static int sum(int a, int b, int c) {
            return a + b + c;
        }

        // Method 3: Concatenate two strings
        public static String sum(String a, String b) {
            return a + b;
        }
    }

    // Main method to demonstrate polymorphism
    public static void main(String[] args) {
        // Testing integer addition
        System.out.println("2 + 3 = " + Calculator.sum(2, 3));
        System.out.println("2 + 3 + 4 = " + Calculator.sum(2, 3, 4));

        // Testing string concatenation
        System.out.println("Hello + World = " + Calculator.sum("Hello", "World"));
    }
}