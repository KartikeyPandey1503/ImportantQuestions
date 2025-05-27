package com.example.importantquestions.ooppract;

import java.util.*;

public class MinPriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPq=new PriorityQueue<Integer>();
        minPq.add(5);
        minPq.add(2);
        minPq.add(8);
        minPq.add(1);
        //lets print all the values using for each method which use Lambda expression
        minPq.forEach((Integer val)->System.out.println(val));

        while(!minPq.isEmpty()){
            int val=minPq.poll();
            System.out.println("REMOVED FROM TOP: "+val);
        }
    }
}
