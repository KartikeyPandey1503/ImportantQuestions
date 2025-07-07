package com.example.importantquestions.GRAPHS;
import java.util.*;
public class BFS {
    //bfs mostly used to find shortest path
    public static void main(String args[]){
        HashMap<Integer,List<Integer>> adj=new HashMap<>();
        adj.put(0,new ArrayList<>());
        adj.put(1,new ArrayList<>());
        adj.put(2,new ArrayList<>());
        adj.put(3,new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).get(3);
        adj.get(2).add(0);
    }
}
