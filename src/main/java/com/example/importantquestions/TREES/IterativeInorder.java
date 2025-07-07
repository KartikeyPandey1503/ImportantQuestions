package com.example.importantquestions.TREES;
// O(N) BOTH SC AND TC
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {
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
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.left.right.right=new Node(7);
        System.out.println(inorderIterative(root));
    }
    public static List<Integer> inorderIterative(Node root){
        List<Integer> inorder=new ArrayList<Integer>();
        Stack<Node> stack=new Stack<Node>();
        Node node=root;
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node=stack.pop();
                inorder.add(node.data);
                node=node.right;
            }
        }
    return inorder;
    }

}
