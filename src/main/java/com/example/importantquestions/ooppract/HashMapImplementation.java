package com.example.importantquestions.ooppract;
import java.util.*;
public class HashMapImplementation {
    public static void main(String args[]){
        Map<Integer,String> rollnovsname=new HashMap<>();
        rollnovsname.put(null,"Test");
        rollnovsname.put(0,null);
        rollnovsname.put(1,"A");
        rollnovsname.put(2,"B");

        //trying putIfAbsent
        rollnovsname.putIfAbsent(null,"TEST");
        rollnovsname.putIfAbsent(1,"C");
        rollnovsname.putIfAbsent(3,"D");

        for(Map.Entry<Integer,String> entry:rollnovsname.entrySet()){
            Integer key=entry.getKey();
            String val=entry.getValue();
            System.out.println(key+" "+val);
        }

    }
}
