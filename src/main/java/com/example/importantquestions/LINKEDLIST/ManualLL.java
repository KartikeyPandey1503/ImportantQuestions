package com.example.importantquestions.LINKEDLIST;
import java.util.*;
public class ManualLL {
    static LinkedList head,temp;
    static LinkedList newnode;
    static class LinkedList1 {
        int data;
        LinkedList1 next;
    }
    class DoubleLinkedList {
        int data;
        DoubleLinkedList next;
        DoubleLinkedList prev;
    }
    public static void insertFirst(int data) {
        LinkedList1 l = new LinkedList1();
        l.data = data;
        l.next = null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList1 head, newnode, temp = null;
        head = null;

        boolean choice = false;
        while (choice == true) {
            LinkedList1 node = new LinkedList1();
            System.out.println("Enter data");
            node.data = sc.nextInt();
            node.next = null;

            if (head == null) {
                head = temp = node;
            } else {
                temp.next = node;
                temp = node;
            }

            temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
        System.out.println("Enter choice");
        choice = sc.nextBoolean();
    }}
