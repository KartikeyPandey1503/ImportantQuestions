package com.example.importantquestions.ooppract;

import java.util.ArrayDeque;

public class DequeImplementation {
    public static void main(String args[]){
        ArrayDeque<Integer> arraydeque=new ArrayDeque<>();
        arraydeque.add(1);//Adding elements
        arraydeque.addFirst(2);
        arraydeque.addLast(3);
        System.out.println(arraydeque.getFirst());
        System.out.println(arraydeque.getLast());
        int e=arraydeque.removeLast();//Deletion
        System.out.println(e);
        System.out.println("Using as a stack now");
        ArrayDeque<Integer> stackDeque=new ArrayDeque<>();
        stackDeque.addFirst(1);
        stackDeque.addFirst(2);
        stackDeque.addFirst(3);
        int removeelement=stackDeque.removeFirst();
        System.out.println("Popped from Stack= "+removeelement);
    }
}
