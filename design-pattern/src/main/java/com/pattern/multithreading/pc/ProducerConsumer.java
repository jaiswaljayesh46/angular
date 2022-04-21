package com.pattern.multithreading.pc;

import java.util.*;

public class ProducerConsumer {

    LinkedList<Integer> list =  new LinkedList<>();
    int capacity = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        while(true){
            synchronized (this){
                if(list.size() ==capacity){
                    wait();
                }
                list.add(value++);
                System.out.println("Producer produces="+value);
                notify();
                Thread.sleep(1000);
            }
            list.add(value++);
            Thread.sleep(1000);
            System.out.println("Producer produces="+value);
        }
    }

    public void consume() throws InterruptedException {
        while(true){
            synchronized (this){
                if(list.size() ==0){
                    wait();
                }
                int value = list.removeFirst();
                System.out.println("Consumer consumes="+value);
                notify();
                Thread.sleep(1000);
            }

        }
    }
}
