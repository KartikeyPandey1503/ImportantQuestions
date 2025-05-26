package com.example.importantquestions.ooppract;

import java.io.FileNotFoundException;

public class Exceptioneg1 {
    public static void main(String[] args) {
        try{
            method1("name");
        }catch(ClassNotFoundException e){

        }catch(InterruptedException e1){

        }finally{
            System.out.println("finally");
        }
    }
    public static void method1(String name)throws ClassNotFoundException, InterruptedException{
        if(name.equals("dummy")){
            throw new ClassNotFoundException();
        }
        if(name.equals("Interrupted")){
            throw new InterruptedException();
        }

    }

}

