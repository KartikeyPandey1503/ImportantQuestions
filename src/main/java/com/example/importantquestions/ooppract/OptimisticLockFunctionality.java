package com.example.importantquestions.ooppract;

import java.util.concurrent.locks.StampedLock;

public class OptimisticLockFunctionality {
    int a=10;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp=lock.tryOptimisticRead();
        try{
            System.out.println("Taken optimistic lock stamp: "+stamp);
            a=11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("updated a value successfully");
            }else{
                System.out.println("Rollback operation");
                a=10;
            }

        }catch(InterruptedException e){

        }
    }
    public void consumer(){
        long stamp=lock.writeLock();
        System.out.println("Write lock acquired by "+Thread.currentThread().getName());
        try{
            System.out.println("Performing work");
            a=9;
        }catch(Exception e){

        }finally{
            lock.unlockWrite(stamp);
            System.out.println("write lock released by "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        OptimisticLockFunctionality o = new OptimisticLockFunctionality();
        Thread t1 = new Thread(() -> o.producer());
        Thread t2 = new Thread(() -> o.consumer());

        t1.start();
        t2.start();
    }
}
