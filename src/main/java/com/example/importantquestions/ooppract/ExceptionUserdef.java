package com.example.importantquestions.ooppract;
class MyCustomException extends Exception{
    MyCustomException(String message){
        super(message);
    }
}
public class ExceptionUserdef {
    public static void main(String[] args) {
        try{
            method1();

            }catch(MyCustomException e){
                //handle

            }
        }
        public static void method1() throws MyCustomException{
        throw new MyCustomException("MyCustomException");
    }
}
