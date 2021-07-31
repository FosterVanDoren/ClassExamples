package com.company.Day5;

class Company{
    char item;
    boolean flag = true;

    synchronized void produce(char item) throws InterruptedException {
        if (!flag) {
            wait();
        }
        this.item = item;
        System.out.println("Produced: " + this.item);
        flag = false;
        notify();
    }

    synchronized char consume() throws InterruptedException {
        if (flag){
            wait();
        }

        System.out.println("Consumed: " + this.item);
        flag = true;
        notify();
        return this.item;
    }
}

class Producer extends Thread{
    Company company;

    Producer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        char c = 'A';
        try {
            this.company.produce(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread{
    Company company;

    Consumer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        try {
            this.company.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo14 {
    public static void main(String[] args) {
        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);

        producer.start();
        consumer.start();
    }
}
