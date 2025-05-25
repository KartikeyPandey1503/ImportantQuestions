package com.example.importantquestions.ooppract;
interface Function<T,R> {
    R apply(T t);
}
public class FunctionFunctionalInterface {
    public static void main(String[] args) {
        Function<Integer,String> integertoString=(Integer num)->{
            String output=num.toString();
            return output;
        };
        System.out.println(integertoString.apply(64));
    }
}
