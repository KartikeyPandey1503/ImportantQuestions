package com.example.importantquestions.ARRAYS;
import java.util.*;
class ThreeSum {
    static List<List<Integer>> result=new ArrayList<>();//global variable
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        System.out.println(threesum(a,target));
    }
    static List<List<Integer>> threesum(int[] a,int target){
        List<List<Integer>> res=new ArrayList<>();
        int n=a.length;
        if(n<3)
            return null;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i+1]==a[i])
                continue;
            int n1=a[i];
            int target1=-n1;
            twoSum(a,target1,i,i+1,n-1);//it will find n1 and n2 for me
        }
        return result;

    }
    public static void twoSum(int[] a,int i,int target,int start,int end){
        List<Integer> res=new ArrayList<>();
        while(start<end){
            if(a[start]+a[end]>target)
                end--;
            else if(a[start]+a[end]<target)
                start++;
            else{
                //we will remove duplicates from either end(start,end)
                while(start<end && a[start]==a[start+1]){
                    start++;
                }
                while(start<end && a[end]==a[end-1]){
                    end--;
                }
                res.add(i);
                res.add(start);
                res.add(end);

            }


        }
        result.add(res);
    }
}