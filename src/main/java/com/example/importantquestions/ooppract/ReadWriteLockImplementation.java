package com.example.importantquestions.ooppract;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockImplementation {
    boolean isAvailable=false;
    public void producer(ReadWriteLock lock) {
        try{
            lock.readLock().lock();
            isAvailable=true;
            System.out.println("Read lock acquired by"+Thread.currentThread().getName());
            Thread.sleep(6000);
        }catch(Exception e){

        }finally{
            lock.readLock().unlock();
            System.out.println("Read lock unacquired by"+Thread.currentThread().getName());
        }
    }
    public void consumer(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Write lock acquired by"+Thread.currentThread().getName());
            isAvailable=false;
        }catch (Exception e){

        }finally{
            lock.writeLock().unlock();
            System.out.println("Write lock unacquired by"+Thread.currentThread().getName());

        }
    }
    public static void main(String[] args) {
        ReadWriteLockImplementation resource = new ReadWriteLockImplementation();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Thread t1 = new Thread(() -> {
                resource.producer(lock);

        });
        Thread t2 = new Thread(() -> {
            resource.producer(lock);
        });
        ReadWriteLockImplementation resource1 = new ReadWriteLockImplementation();
        Thread t3 = new Thread(() -> {
            resource1.consumer(lock);
        });
        t1.start();
        t2.start();
        t3.start();


    }
}
