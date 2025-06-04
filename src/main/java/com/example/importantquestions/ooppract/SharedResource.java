package com.example.importantquestions.ooppract;

public class SharedResource {
    boolean itemAvailable=false;
    //synchronised put the monitor locks
    public synchronized void addItem() {
        itemAvailable=true;
        System.out.println("Item added by"+Thread.currentThread().getName());
        notifyAll();
    }
    public synchronized void consumeItem() throws InterruptedException {
        System.out.println("Consume item by"+Thread.currentThread().getName());
        while(!itemAvailable) {
            try{
                System.out.println("Thread "+Thread.currentThread().getName()+" is waiting");
                wait();
            }catch(InterruptedException e){
                System.out.println("Thread "+Thread.currentThread().getName()+" interrupted");
            }
        }
        System.out.println("Item consumed by"+Thread.currentThread().getName());
        itemAvailable=false;
    }

    public static void main(String args[]) {
        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(() -> sharedResource.addItem());
        Thread consumer = new Thread(() -> {
            try {
                sharedResource.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();
    }
}

