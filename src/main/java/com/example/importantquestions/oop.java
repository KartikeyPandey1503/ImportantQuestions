package com.example.importantquestions;

public class oop {
    public static class Dog{
        private String color;
        String getDogColor(){
            return color;
        }
        void Setcolor(String color){
            this.color = color;
        }
    }
    public static void main(String args[]){
        Dog labra=new Dog();
        labra.Setcolor("black");
        System.out.println(labra.getDogColor());
    }
}
