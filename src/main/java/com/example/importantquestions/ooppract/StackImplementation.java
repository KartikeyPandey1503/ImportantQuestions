package com.example.importantquestions.ooppract;
import java.util.*;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        st.push(35);
        st.push(123);
        int a=st.peek();
        System.out.println(a);
        int at=st.search(35);
        System.out.println(at);

    }
}
