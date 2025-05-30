package com.example.importantquestions.ooppract;
import java.util.*;
public class LinkedListPract
{
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(200);
        ll.addLast(300);
        ll.addLast(400);
        ll.addFirst(100);
        System.out.println(ll.getFirst());
    }
}
