package com.example.importantquestions.ooppract;

import java.util.Arrays;

public class Comparatoridea {
    public static void main(String[] args) {
        Integer[] arr={17,4,35,4};
        Arrays.sort(arr);
        for(Integer i:arr){
            System.out.println(i);
        }
        //now adding a comparator to it
        Integer[] arr2={17,4,35,4};
        Arrays.sort(arr2,(Integer val1,Integer val2)->val1-val2);
        for(Integer i:arr){
            System.out.println(i);
        }
    }
}
