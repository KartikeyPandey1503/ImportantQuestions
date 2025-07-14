package com.example.importantquestions.ARRAYS;
import java.util.*;
public class GroupAnagramWithSorting {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number of words");
        int n=sc.nextInt();
        System.out.printf("Enter the words");
        for (int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.print(anagrams(list));
    }
    public static List<List<String>> anagrams(List<String> list){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:list){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String word=new String(chars);
            if(map.containsKey(word)){
                map.get(word).add(str);
            }else{
                map.put(word,new ArrayList<>());
                map.get(word).add(str);
            }
        }
return new ArrayList<>(map.values());
    }
}
