package com.example.importantquestions.TREES;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativvePostOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(7);
        root.left.right=new Node(4);
        System.out.println(postorder(root));
    }
    public static List<Integer> postorder(Node root){
        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if(root.left != null){
                st1.push(root.left);
            }
            if(root.right != null){
                st1.push(root.right);
            }
        }
        while (!st2.isEmpty()) {
            list.add(st2.pop().data);
        }
        return list;
    }
}
