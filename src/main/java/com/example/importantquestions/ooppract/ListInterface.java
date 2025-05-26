package com.example.importantquestions.ooppract;
import java.util.*;
public class ListInterface {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");
        System.out.println("Elements of the list are");
        for(String s:li){
            System.out.println(s);
        }
        System.out.println("Element at index 1 is "+li.get(1));
        //Updating elements
        li.set(1,"JavaScript");
        System.out.println("Updated list"+li);
        li.remove("C++");
        System.out.println("List after removing"+li);
        li.add(0,"html");
        System.out.println(li);
        int i=li.indexOf("Java");
        System.out.println(i);
        li.remove(0);
        System.out.println(li);
        li.remove("JavaScript");
        System.out.println(li);
        String a=li.get(1);
        System.out.println(a);
        boolean isPresent=li.contains("Java");
        System.out.println(isPresent);
    }

}
