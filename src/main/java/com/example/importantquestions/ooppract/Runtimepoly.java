package com.example.importantquestions.ooppract;
class Animal{
    public void makeSound(){
        System.out.println("Animal MakeSound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("bho bho");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("meow meow");
    }
}
public class Runtimepoly {
        public static void main(String[] args) {
            Animal a = new Dog();
            a.makeSound();
            Animal b = new Cat();
            b.makeSound();
            Animal c=new Animal();
            c.makeSound();
        }

}
