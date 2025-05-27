package com.example.importantquestions.ooppract;

import java.util.*;

public class Collectionsworking {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("max valus is "+Collections.max(list));
        System.out.println("min valus is "+Collections.min(list));
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
