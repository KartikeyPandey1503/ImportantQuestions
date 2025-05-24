package com.example.importantquestions.ooppract;

class OOP {
    public static class Vehicle{
        boolean haseNGINE;
        boolean getEngine(){
            return haseNGINE;
        }
    }
    static class Car extends Vehicle{
        int cc;
        String type="hatchback";
        String getCartype(){
            System.out.println(type);

            return type;
        }
    }
    public static void main(String args[]){
        Car swift=new Car();
        swift.getEngine();
        swift.getCartype();
    }
}
