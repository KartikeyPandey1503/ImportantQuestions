package com.example.importantquestions.ooppract;

public abstract class CarS implements Comparable<Car>{
    String name,type;
    CarS(String name,String type){
        this.name=name;
        this.type=type;
    }
    public int compareTo(CarS car){
        return this.name.compareTo(car.name);
    }


}
