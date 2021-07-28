package com.company.Day3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InsufficientFundException(String message){
        System.out.println(message);
    }
}

class BankAccount{
    private int balance = 0;
    private int accountNumber = 0;

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount credited: " + amount);
    }


    public void withdraw(int amount) throws InsufficientFundException{
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount debited: " + amount);
        }else{
            throw new InsufficientFundException("Sorry, you don't have a sufficient balance");
        }
    }

}

public class Demo20 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456);
        System.out.println(account.getBalance());
        account.deposit(1000);
        try {
            account.withdraw(4000);
        } catch (InsufficientFundException e) {
            //e.printStackTrace();
        }
        account.deposit(3000);
        try {
            account.withdraw(2000);
        } catch (InsufficientFundException e) {
            e.printStackTrace();
        }
    }
}
