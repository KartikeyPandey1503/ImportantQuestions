package com.example.importantquestions.TREES;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrder {
    //we will be using stack data structure
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
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.left.left=new Node(5);
        root.left.left.right=new Node(6);
        //iterative preorder
        System.out.println(preorderiterative(root));
    }
    public static List<Integer> preorderiterative(Node root){
        //stack me pehle right lena then left
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Stack<Node> stack=new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()){
            root=stack.pop();
            list.add(root.data);
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return list;

    }
}
