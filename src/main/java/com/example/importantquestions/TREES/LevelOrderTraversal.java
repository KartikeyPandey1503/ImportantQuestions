package com.example.importantquestions.TREES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//in level order we require a Queue data structure
public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(levelorder(root));
    }
    public static List<List<Integer>> levelorder(Node root){
        Queue<Node> q=new LinkedList<Node>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        q.add(root);
        while(!q.isEmpty()){
            int levelnum=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<levelnum;i++){
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                list.add(q.poll().data);
            }
            res.add(list);
        }
    return res;
    }
}
