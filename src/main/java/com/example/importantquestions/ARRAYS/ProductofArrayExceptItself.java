package com.example.importantquestions.ARRAYS;
import java.util.*;
public class ProductofArrayExceptItself {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        productexceptitself(a);
    }
    public static void productexceptitself(int[] a){
        int pre=1,post=1;
        int result[]=new int[a.length];
        Arrays.fill(result,1);
        for(int i=0;i<a.length;i++){
            result[i]=pre;
            pre=a[i]*pre;
        }
        for(int i=a.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*a[i];
        }
    for(int i=0;i<a.length;i++){
        System.out.print(result[i]+" ");
    }
    }
}
