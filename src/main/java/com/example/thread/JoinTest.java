package com.example.thread;

class Print implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() +" ---> Started");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            System.out.println(Thread.currentThread().getName() +" ---> Finished");
        }
    }
}
public class JoinTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Print());
        Thread t2 = new Thread(new Print());
        Thread t3 = new Thread(new Print());

        t1.start(); t2.start(); t3.start();


    }
}
