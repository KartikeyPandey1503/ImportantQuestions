package com.example.importantquestions.ooppract;
import java.util.*;
public class ListMethods {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(0,5);
        list.add(1,7);
        list.add(2,9);
        System.out.println("First list" +list);
        List<Integer> list2=new ArrayList<>();
        list2.add(0,2);
        list2.add(1,1);
        list2.add(2,4);
        list.addAll(list2);
        System.out.println("ADD all function="+list);
        list.sort((Integer a,Integer b)->a-b);
        System.out.println("Sorted list using Comparator="+list);
        System.out.println("First element= "+list.get(0));
        list.set(0,50);
        System.out.println("Set element 50 at first place= "+list);
        list.remove(0);
        System.out.println(list);
        System.out.println("Index of 7="+list.indexOf(7));
    }
}
