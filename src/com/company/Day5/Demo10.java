package com.company.Day5;

class Bank{
    int balance = 10000;

    synchronized void withdraw(int amount){
        System.out.println("Withdrawal processing...");
        if(balance < amount) {
            System.out.println("Balance insufficient, waiting for deposit");
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance -= amount;
        System.out.println("Withdrawal complete!");
    }

    synchronized void deposit (int amount){
        System.out.println("Deposit processing...");
        balance += amount;
        System.out.println("Deposit complete!");
        notify();
    }
}

class DepositThread extends Thread{
    Bank bank;

    public DepositThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.deposit(20000);
    }
}

class WithdrawalThread extends Thread {
    Bank bank;

    public WithdrawalThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.withdraw(30000);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        DepositThread depositThread = new DepositThread(bank);
        WithdrawalThread withdrawalThread = new WithdrawalThread(bank);

        withdrawalThread.start();
        depositThread.start();

    }
}
