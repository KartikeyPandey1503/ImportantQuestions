package com.example.importantquestions.ooppract;

import java.util.PriorityQueue;

public class MaxPriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPq=new PriorityQueue<>((Integer a,Integer b) -> b-a);
        maxPq.add(10);
        maxPq.add(5);
        maxPq.add(15);
        maxPq.add(12);
        maxPq.forEach((Integer val)->System.out.println(val));
    }
}
