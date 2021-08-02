package com.company.Day6;

interface  IBank{
    void deposit(int amount);

    void withdraw(int amount);
}

class SavingsAccount implements IBank{

    @Override
    public void deposit(int amount) {
        System.out.println("Deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw amount: " + amount);

    }
}

class CheckingAccount implements IBank{

    @Override
    public void deposit(int amount) {
        System.out.println("Deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw amount: " + amount);
    }
}

class LoanAccount implements IBank{

    @Override
    public void deposit(int amount) {
        System.out.println("Deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw amount: " + amount);
    }
}

class EnterpriseAccount implements IBank{

    @Override
    public void deposit(int amount) {
        System.out.println("Deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw amount: " + amount);
    }
}

class Accounts {
    public static IBank getAccount(AccountType id){
        switch (id){
            case SAVINGS_ACCOUNT:
                System.out.println("Savings account");
                return new SavingsAccount();
            case CHECKING_ACCOUNT:
                System.out.println("Checking account");
                return new CheckingAccount();
            case LOAN_ACCOUNT:
                System.out.println("Loan account");
                return new LoanAccount();
            case ENTERPRISE_ACCOUNT:
                System.out.println("Enterprise account");
                return new EnterpriseAccount();
            default:
                return null;
        }
    }
}

enum AccountType {
    SAVINGS_ACCOUNT,
    CHECKING_ACCOUNT,
    LOAN_ACCOUNT,
    ENTERPRISE_ACCOUNT
}

public class Demo8 {
    public static void main(String[] args) {
//        SavingsAccount savingsAccount = new SavingsAccount();
//        CheckingAccount checkingAccount = new CheckingAccount();
//
//        savingsAccount.deposit(1000);
//        savingsAccount.withdraw(500);
//
//        checkingAccount.deposit(2000);
//        checkingAccount.withdraw(1000);

        IBank account1 = Accounts.getAccount(AccountType.ENTERPRISE_ACCOUNT);
        account1.deposit(1000);
        account1.withdraw(500);
    }
}
