package com.example.importantquestions.ooppract;
interface kp{
    final int a=10;
    void display();
}
class Kr implements kp{
  public void display() {
      System.out.println("Geeks for Geeks");
  }
}
public class Interfacegrrks {
    public static void main(String[] args) {
        Kr kr = new Kr();
        kr.display();
    }

}
