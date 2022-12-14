package org.example;

import java.text.DecimalFormat;

public class BankAccount {
    private double balance;
    private double minBalance;
    private String accHolderName;
    private AccType accType;

    enum AccType {SAVINGS, CURRENT, CHECKING, MMA, FD,};

    public BankAccount(double bal, String accHolderName, AccType accType){
        super();

        if(bal<0){
            throw new IllegalArgumentException("Insufficient funds");
        }
        if(accHolderName==null){
            throw new NullPointerException("Please provide a user name");
        }

        this.setBalance(bal);
        this.setAccHolderName(accHolderName);
        this.setAccType(accType);
        this.setMinBalance(50);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        DecimalFormat df = new DecimalFormat("#.##");
        this.balance = Double.parseDouble(df.format(balance));
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public String getAccHolderName() {

        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
        this.accType = accType;
    }


    public void deposit(double i) {
        if(i<0){
            throw new IllegalArgumentException("Please enter a value to deposit");
        }
        setBalance(balance +i);
    }

    public void withdraw(int i) {
        if(i<0){
            throw new IllegalArgumentException("Please enter a value to withdraw");
        }
        if(balance -i<minBalance){
            throw new IllegalArgumentException("Insufficient funds, please withdraw less than the amount u have");
        }
        setBalance(balance -i);
    }

    public void printInfo() {
        System.out.println("Account holder name: " + this.getAccHolderName());
        System.out.println("Account account type: " + this.getAccType());
        System.out.println("Account balance: " + this.getBalance() +"\n");
    }
}


