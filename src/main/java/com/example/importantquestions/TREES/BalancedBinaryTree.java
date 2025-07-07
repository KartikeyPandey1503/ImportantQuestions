package com.example.importantquestions.TREES;

public class BalancedBinaryTree {
    //for every node height(left)-height(right)<=1
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
        root.right.left.left=new Node(6);
        System.out.print(balanced(root));
    }
    public static boolean balanced(Node root){
       return dfsHeight(root)!= -1;
    }
    public static int dfsHeight(Node root){
        if(root==null) return 0;
        int left=dfsHeight(root.left);
        if(left==-1) return -1;
        int right=dfsHeight(root.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;

    }
}
