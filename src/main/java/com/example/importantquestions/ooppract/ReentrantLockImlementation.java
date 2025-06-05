package com.example.importantquestions.ooppract;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockImlementation {
    boolean isAvailable=false;
    ReentrantLock lock=new ReentrantLock();
    public void producer() {
        try {
            lock.lock();
            System.out.println("Lock acquired"+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch(Exception e) {

        }finally {
            lock.unlock();
            System.out.println("Unlock acquired"+Thread.currentThread().getName());

        }
    }
    public static void main(String[] args) {
        ReentrantLockImlementation obj=new ReentrantLockImlementation();
        Thread t1=new Thread(() -> obj.producer());
        Thread t2=new Thread(() -> obj.producer());
        t1.start();
        t2.start();
    }
}
