package com.example.importantquestions.ooppract;
import java.util.*;
public class ProducerConsumer {
    public static class SharedResource {
        private Queue<Integer> sharedBuffer;
        private int buffersize;
        public SharedResource(int buffersize) {
            this.buffersize = buffersize;
            sharedBuffer = new LinkedList<>();
        }
        public synchronized void produce(int item)throws Exception{
            //if the buffer is full wait for the consumer to consume items
            while(sharedBuffer.size()==buffersize){
                System.out.println("Waiting for shared buffer to be empty");
                wait();
            }
            sharedBuffer.add(item);
            System.out.println("Produced "+item);
            notifyAll();
        }
        public synchronized int consume()throws Exception{
            //buffer is empty wait for the producer to produce items
            while(sharedBuffer.isEmpty()){
                System.out.println("Waiting for shared buffer to be empty");
                wait();
            }
            int item = sharedBuffer.remove();
            System.out.println("Consumed "+item);
            notifyAll();
            return item;
        }
    }
    public static void main(String[] args) {
        SharedResource sharedBuffer=new SharedResource(3);
        Thread producer=new Thread(()->{
            try{
                for(int i=0;i<10;i++){
                    sharedBuffer.produce(i);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        });
        Thread consumer=new Thread(()->{
            try{
                for(int i=0;i<10;i++){
                    sharedBuffer.consume();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        });
        producer.start();
        consumer.start();

    }
}
