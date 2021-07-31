package com.company.Day5;

class MultiThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MultiThreadRunnable runnableDemo = new MultiThreadRunnable();
//        runnableDemo.start(); this method does not exist for the runnable interface

        Thread t1 = new Thread(runnableDemo);
        t1.start();
    }
}
