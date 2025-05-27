package com.example.importantquestions.ooppract;
import java.util.*;
public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        int s=li.size();
        System.out.println(s);
        boolean e=li.isEmpty();
        System.out.println(e);
        boolean con=li.contains(2);
        System.out.println(con);
        Object[] arr=li.toArray();
        for(Object o:arr){
            System.out.println(o);
        }
        List<Integer> li2=new ArrayList<>();
        li2.add(7);
        li2.add(8);
        li.addAll(li2);
        System.out.println(li);
        li2.removeAll(li2);
        boolean comp=li.equals(li2);
        System.out.println(comp);

    }
}
