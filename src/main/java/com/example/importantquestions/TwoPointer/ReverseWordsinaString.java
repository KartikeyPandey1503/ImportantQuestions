package com.example.importantquestions.TwoPointer;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

import static java.util.Collections.reverse;
import static java.util.Collections.swap;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //extra spaces ko hatana bhi hai last me koi space mahi hona and end me koi space nahi hota
        int i=0;//main will be l and r jo reverse karenge word ko
        int l=0,r=0;
        int n=s.length();
        while(i<n){
            while(i<n && s.charAt(i)==' '){
                swap(Collections.singletonList(s),r,i);//i ko char dikha to r ko dega and then i++ and r++
                i++;
                r++;

            }
            if(l<r){
                reverse();
                r++;
                l=r;
            }
            i++;
        }
        s=s.substring(0,r-1);
        System.out.println(s);

    }

    private static void reverse() {
    }

    public void swapChars(String s,int index1,int index2){
        if(s==null || index1<0 || index2<0 || index1>=s.length() || index2>=s.length()){
            return;
        }
        char[] chars= s.toCharArray();
        char temp=chars[index1];
        chars[index1]=chars[index2];
        chars[index2]=temp;

        s=new String(chars);
    }
}
