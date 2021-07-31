package com.company.Day5;

class ThreadPriorityDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Name of running thread: " + Thread.currentThread().getName());
        System.out.println("Priority of running thread: " + Thread.currentThread().getPriority());
    }
}

public class Demo6 {
    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
}
