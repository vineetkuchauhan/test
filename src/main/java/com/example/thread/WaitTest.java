package com.example.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitTest implements Runnable {
    static Object lock = new Object();
    static int counter = 0;
    static boolean isOdd = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(new WaitTest());
        Thread t2 = new Thread(new WaitTest());
        Thread t3 = new Thread(new WaitTest());

        t1.start();
        t2.start();
        t3.start();
    }

    public void run() {
        while (counter < 999999)
            synchronized (lock) {
                counter++;
                String tName = Thread.currentThread().getName();
                System.out.println(tName + " is printing --> " + counter);
                try {
                    if (isOdd) {
                        isOdd = !isOdd;

                        System.out.println(Thread.currentThread().getName() + " --> Locked");
                        lock.wait();
                        lock.notify();
                    } else {
                        isOdd = !isOdd;

                        lock.notify();
                        System.out.println(Thread.currentThread().getName() + " --> Locked");
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
