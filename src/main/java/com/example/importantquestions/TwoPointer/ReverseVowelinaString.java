package com.example.importantquestions.TwoPointer;
import java.util.*;
public class ReverseVowelinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        int i = 0;
        int length = s.length();
        int j = length-1;
        char[] sa=s.toCharArray();
        while (i < j) {
            if(!isVowel(s.charAt(i)))
                i++;
            if(!isVowel(s.charAt(j)))
                j--;
            if(isVowel(s.charAt(i))==isVowel(s.charAt(j)))
            {
                char temp=sa[i];
                sa[i]=sa[j];
                sa[j]=temp;

            }}
       for(char ch:sa)
           System.out.print(ch);

    }
    public static boolean isVowel(char c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return true;

        return false;
    }
}
