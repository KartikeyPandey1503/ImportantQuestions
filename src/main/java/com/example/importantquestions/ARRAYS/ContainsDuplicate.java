package com.example.importantquestions.ARRAYS;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(containsduplicate(a));
    }
    public static boolean containsduplicate(int[] a){
        Set<Integer> visited=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(visited.contains(a[i]))
                return true;
            else
                visited.add(a[i]);
        }
        return false;

    }
}
