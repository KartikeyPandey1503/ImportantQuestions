package com.example.importantquestions.ARRAYS;
import java.util.*;
public class TwoSum {
    //we need to return the indices of the two numbers such that they add to the target
    static List<Integer> twosum(int target,int[] numbers){
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int length=numbers.length;
        for(int i=0;i<length;i++){
            int remaining=target-numbers[i];
            if(map.containsKey(remaining)){
                list.add(map.get(remaining));
                list.add(i);
                return list;
            }
            map.put(numbers[i],i);
        }
        return list;

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] numbers=new int[6];
        System.out.println("Enter elements of the array:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=in.nextInt();
        }
        System.out.println("Enter the target");
        int target=in.nextInt();
        System.out.println(twosum(target,numbers));
    }
}
