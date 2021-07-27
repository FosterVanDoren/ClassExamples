package com.company.Day2;

interface IBankAccount{
  boolean deposit(double amount);
  boolean withdraw(double amount);
  void getBalance();
}

class SavingAccount implements IBankAccount{
    private  double balance;
    private double perDayLimit;
    
    @Override
    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance < amount){
            System.out.println("Insufficient balance!");
            return false;
        }
        //limit 10000
        else if(perDayLimit + amount > 10000){
            System.out.println("Withdraw attempt failed");
            return false;
        }
        else{
            balance -= amount;
            perDayLimit -=  amount;
            System.out.println("Successfully withdrew: " + amount);
            return true;
        }
       
    }

    @Override
    public void getBalance() {
        System.out.println("Saving Account Balance: " + balance);

    }
}

class CurrentAccount implements IBankAccount{
    
    private double balance;
    
    @Override
    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance < amount){
            System.out.println("Insufficient balance!");
            return false;
        }else{
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
            return true;
        }

    }

    @Override
    public void getBalance() {
        System.out.println("Current Account Balance: "+ balance);
    }
}

public class Demo20 {
    public static void main(String[] args) {
        IBankAccount savingAccount = new SavingAccount();
        IBankAccount currentAccount = new CurrentAccount();

        savingAccount.deposit(20000);
        savingAccount.withdraw(15000);
        savingAccount.getBalance();

        currentAccount.deposit(30000);
        currentAccount.withdraw(10000);
        currentAccount.getBalance();
    }
}
