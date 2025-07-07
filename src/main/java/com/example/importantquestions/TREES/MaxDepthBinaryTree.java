package com.example.importantquestions.TREES;

public class MaxDepthBinaryTree {
    //we can use recursive or levelorder approach 1+max(l,r)
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
        root.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
        root.right.left.left=new Node(6);
        System.out.println(maxdepth(root));
    }
    public static int maxdepth(Node root){
        if (root == null) return 0;
        int lh=maxdepth(root.left);
        int rh=maxdepth(root.right);
        return 1+Math.max(lh,rh);
    }
}
