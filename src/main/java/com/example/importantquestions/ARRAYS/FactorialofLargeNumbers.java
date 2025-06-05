package com.example.importantquestions.ARRAYS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class FactorialofLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1); // Initialize with 1 (factorial of 0 is 1)

        for (int multiplier = 2; multiplier <= n; multiplier++) {
            multiply(list, multiplier);
        }

        // Print the result in reverse order
        System.out.print("Factorial: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }

    static void multiply(List<Integer> list, int multiplier) {
        int carry = 0;
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int res = multiplier * list.get(i) + carry;
            list.set(i, res % 10);
            carry = res / 10;
        }

        while (carry > 0) {
            list.add(carry % 10); // Use add() instead of set() to expand the list
            carry = carry / 10;
        }
    }
}