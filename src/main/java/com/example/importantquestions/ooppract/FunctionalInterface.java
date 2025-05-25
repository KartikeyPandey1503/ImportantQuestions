package com.example.importantquestions.ooppract;
interface Bird {
    void canFly(String val);  // No parameters
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Bird eagle = (String value) -> {  // No parameters in lambda
            System.out.println("Eagle bird implementation");
        };
        eagle.canFly("Vertical");  // No arguments
    }
}