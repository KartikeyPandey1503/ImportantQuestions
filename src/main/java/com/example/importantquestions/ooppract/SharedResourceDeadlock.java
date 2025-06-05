package com.example.importantquestions.ooppract;

public class SharedResourceDeadlock {
    boolean isAvailable=false;
    //we are creating a method like
    public synchronized void produce(){
        System.out.println("Lock acquired");
        isAvailable=true;
        try {
            Thread.sleep(1000);
        }catch(Exception e){

        }

        System.out.println("Lock released");
    }
    public static void main(String args[]){
        SharedResourceDeadlock obj=new SharedResourceDeadlock();
        System.out.println("Main thread starting");
        Thread t1=new Thread(() ->{
            System.out.println("Thread 1 calling produce method");
            obj.produce();
        });
        Thread t2=new Thread(() ->{
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
            System.out.println("Thread 2 calling produce method");
            obj.produce();
        });
        t1.start();
        t1.setPriority(10);
        try{
            System.out.println("it will wait for thread 1 to finish now since join is used");
            t1.join();
        }catch(Exception e){

        }
        t2.start();

        try {
            Thread.sleep(2000);
        }catch(Exception e){

        }
        System.out.println("Trying to suspend the thread but it is deprecated in java 1.2 because it is prone to deadlocks");
    }
}
