package com.example.importantquestions.ooppract;

public class StartingaThread
{
    static class MultiLearn implements Runnable{
        public void run(){
            System.out.println("code executed"+Thread.currentThread().getName());
        }
    }
    public static void main(String args[]){
        System.out.println("Going inside main method"+Thread.currentThread().getName());
        MultiLearn obj=new MultiLearn();
        Thread thread=new Thread(obj);
        thread.start();
        System.out.println("Finish main method"+Thread.currentThread().getName());
    }
}
