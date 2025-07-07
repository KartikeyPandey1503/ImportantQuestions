package com.example.importantquestions.GRAPHS;
import java.util.*;
import java.util.HashMap;

public class GrahReresentation {
    public static void main(String[] args) {
        HashMap<Integer,List<Integer>> graph = new HashMap<Integer,List<Integer>>();
        for (int i = 0; i < 10; i++) {
            graph.put(i, new ArrayList<>());

            for (int j = 9; j >= 0; j--) {
                graph.get(i).add(j);
            }
        }
        System.out.println(graph);//har node yaha har kisi se connected hai including itself
    }
}
