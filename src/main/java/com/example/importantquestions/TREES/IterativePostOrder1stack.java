package com.example.importantquestions.TREES;

public class IterativePostOrder1stack {
     static class Node{
         int data;
         Node right;
         Node left;
         Node(int data){
             this.data = data;
         }
     }
     public static void main(String args[]){
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(7);
         root.left.left=new Node(3);
         root.left.left.right=new Node(4);
         root.left.left.right.right=new Node(5);
         root.right.left=new Node(8);
         root.right.right = new Node(9);
     }
}
