package com.example.importantquestions.ooppract;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface Consumer<T>{
    public void accept(T t);
}

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<Integer> loggingObject=(Integer val)->{
            if(val>10){
                System.out.println("Logging");
            }
        };
    }
}
