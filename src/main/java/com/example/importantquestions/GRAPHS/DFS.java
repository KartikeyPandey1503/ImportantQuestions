package com.example.importantquestions.GRAPHS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DFS {
    public static void main(String[] args) {
      HashMap<Integer, List<Integer>> adj = new HashMap<>();
        adj.put(0, new ArrayList<>());
        adj.put(1, new ArrayList<>());
        adj.put(2, new ArrayList<>());
        adj.put(3, new ArrayList<>());
        adj.get(0).add(1);
        adj.get(1).add(3);
        adj.get(1).add(0);
        adj.get(0).add(1);
        adj.get(0).add(1);
        int[] visited=new int[4];
        dfs(adj,1,visited);
    }
    public static void dfs(HashMap<Integer,List<Integer>> adj,int i,int[] visited){
        if(visited[i]==1){
            return;
        }
        visited[i]=1;
        System.out.println(i);
       for(int neighbor:adj.get(i)){
           dfs(adj,neighbor,visited);
       }
    }
}
