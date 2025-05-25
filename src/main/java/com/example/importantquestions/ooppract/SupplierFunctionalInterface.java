package com.example.importantquestions.ooppract;
interface Supplier<T> {
    T get();
}
public class SupplierFunctionalInterface {
    public static void main(String[] args) {
        Supplier<String> isEvenNumber=()->"returning";
        System.out.println(isEvenNumber.get());
    }
}
