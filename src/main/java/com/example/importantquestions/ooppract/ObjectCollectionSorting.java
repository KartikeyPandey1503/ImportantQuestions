package com.example.importantquestions.ooppract;

import java.util.Arrays;

class Cars{
    String name;
    String type;
    Cars(String n, String t){
        this.name = n;
        this.type = t;
    }
}
public class ObjectCollectionSorting {
    public static void main(String[] args) {
        Cars[] carArray=new Cars[3];
        carArray[0]=new Cars("Ford","Sedan");
        carArray[1]=new Cars("Audi","SUV");
        carArray[2]=new Cars("BMW","Hatchback");
        Arrays.sort(carArray,(Cars obj1,Cars obj2)->obj1.type.compareToIgnoreCase(obj2.type));
        for(Cars car:carArray){
            System.out.println(car.name);
        }
    }
}
