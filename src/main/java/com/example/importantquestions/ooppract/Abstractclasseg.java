package com.example.importantquestions.ooppract;
abstract class Car{
    int mileage;
    Car(int mileage){
        this.mileage = mileage;
    }
    public abstract void pressBreak();
    public abstract void pressClutch();
    public int getNumberofWheels(){
        return 4;
    }
}
abstract class LuxuryCar extends Car{
    LuxuryCar(int mileage){
        super(mileage);
    }
    public abstract void pressDualBreakSystem();
    @Override
    public void pressBreak() {
        pressDualBreakSystem();
    }

}
class Audi extends LuxuryCar{
    Audi(int mileage){
        super(mileage);
    }
    @Override
    public void pressClutch() {
        System.out.println("Clutch");
    }
    public void pressDualBreakSystem(){
        System.out.println("Dual Break System");
    }

}
public class Abstractclasseg {
    public static void main(String[] args) {
        Audi audi = new Audi(100);
        audi.pressDualBreakSystem();
        audi.pressClutch();
    }
}
