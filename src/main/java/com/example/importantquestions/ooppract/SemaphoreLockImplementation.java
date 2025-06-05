package com.example.importantquestions.ooppract;

import java.util.concurrent.Semaphore;

public class SemaphoreLockImplementation {
    boolean isAvailable=false;
    Semaphore lock=new Semaphore(2);
    public void producer() {
        try{
        lock.acquire();
        System.out.println("Lock acquired by " + Thread.currentThread().getName());
        isAvailable=true;
        Thread.sleep(3000);
    }catch(InterruptedException e){
        }finally{
            lock.release();
            System.out.println("Lock released by " + Thread.currentThread().getName());

        }
    }
    public static void main(String args[]){
        SemaphoreLockImplementation obj=new SemaphoreLockImplementation();
        Thread t1=new Thread(() -> obj.producer());
        Thread t2=new Thread(() -> obj.producer());
        Thread t3=new Thread(() -> obj.producer());
        Thread t4=new Thread(() -> obj.producer());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
