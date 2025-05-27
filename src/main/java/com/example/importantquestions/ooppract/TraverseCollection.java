package com.example.importantquestions.ooppract;
import java.util.*;
public class TraverseCollection {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println("Iterating values using Iterator method");
        Iterator<Integer> valuesIterator= li.iterator();
        while(valuesIterator.hasNext()){
            int val=valuesIterator.next();
            System.out.println(val);
            if(val==3){
                valuesIterator.remove();
            }
        }
        System.out.println("Iterating the values using for each");
        for(int val:li){
            System.out.println(val);
        }
        System.out.println("Iterating the values using for each which uses Lambda expression");
        li.forEach(val -> System.out.println(val));
    }
}
