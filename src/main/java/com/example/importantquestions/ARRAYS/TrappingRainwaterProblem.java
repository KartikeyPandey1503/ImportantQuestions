package com.example.importantquestions.ARRAYS;
import java.util.*;
public class TrappingRainwaterProblem {
   static int[] getLeftMax(int[] arr) {
        if(arr == null || arr.length == 0)
            return null;
        int[] max = new int[arr.length];
        max[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max[i] = Math.max(max[i - 1], arr[i]);
        }
        return max;
    }
    static int[] getRightMax(int[] arr) {
        if(arr == null || arr.length == 0)
            return null;
        int[] max=new int[arr.length];
        max[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            max[i]=Math.max(max[i+1],arr[i]);
        }
        return max;
    }
    static int trappingRainwater(int[] arr) {
        int n=arr.length;
        int[] left=new int[arr.length];
        left=getLeftMax(arr);
        int[] right=new int[arr.length];
        right=getRightMax(arr);
        int sum=0;
        for(int i=0;i<n;i++){
            int width=1;
            int h=Math.min(left[i],right[i])-arr[i];
            sum += width*h;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("Enter number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements in the array: ");
        //0 1 0 2 1 0 1 3 2 1 2 1
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(trappingRainwater(a));

    }
}
