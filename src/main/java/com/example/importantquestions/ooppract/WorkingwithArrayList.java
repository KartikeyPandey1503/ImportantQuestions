package com.example.importantquestions.ooppract;
import java.util.*;
public class WorkingwithArrayList {
    public static void main(String args[]){
        List<Integer> list1=new ArrayList<>();
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        List<Integer> list2=new ArrayList<>();
        list2.add(0,400);
        list2.add(1,500);
        list2.add(2,600);

        list1.addAll(2,list2);
        list1.forEach((Integer val)->System.out.println(val));
        list1.replaceAll((Integer val)->-1*val);
        System.out.println("After replaceAll");
        list1.forEach((Integer val)->System.out.println(val));

        list1.sort((Integer a,Integer b)->a-b);
        System.out.println("After sort");
        list1.forEach((Integer val)->System.out.println(val));

        System.out.println("Get the value present at index 2");
        System.out.println(list1.get(2));

        System.out.println("Set index 2 as 400");
        list1.set(2,40);
        System.out.println(list1);

        System.out.println("Removing elelment at index 2");
        list1.remove(2);
        System.out.println(list1);

        System.out.println("Finding index of");
        list1.indexOf(-400);
        System.out.println(list1);

        System.out.println("Starting with iterator");
        ListIterator<Integer> iter=list1.listIterator();
        while(iter.hasNext()){
            int val=iter.next();
            System.out.println(val);
            if(val==400){
                iter.add(10);
            }
        }
        list1.forEach((Integer val)->System.out.println(val));

        System.out.println("Creating a sublist");
        System.out.println(list1.subList(0,2));

    }
}
