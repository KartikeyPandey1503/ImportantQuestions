package com.example.importantquestions.ooppract;

public class Exceptionraise {
    public static void main(String args[]){
        method1();
    }
    public static void method1(){
        try{
            throw new ClassNotFoundException();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
