package com.example.importantquestions.ooppract;

public class MonitorLockExample {
    public synchronized void task1(){
        //do something
        try{
            System.out.println("Inside task1");
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void task2(){
        System.out.println("task2 but before synchronised");
        synchronized(this){
            System.out.println("Inside task2 synchronised");
        }
    }
    public void task3(){
        System.out.println("Inside task3");
    }
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1=new Thread(()-> obj.task1());
        Thread t2=new Thread(()-> obj.task2());
        Thread t3=new Thread(()-> obj.task3());
        t1.start();
        t2.start();
        t3.start();
    }
}
