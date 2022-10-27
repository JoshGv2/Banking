package org.example;

public class BankAccount {
    private double Balance;
    private double minBalance;
    private String accHolderName;

    public BankAccount(double bal, double minBal, String accHolderName){
        super();
        if(bal<0|| minBal<0){
            throw new IllegalArgumentException("Insufficient funds");
        }
        if(accHolderName==null){
            throw  new NullPointerException("Please provide a user name");
        }
    }




}
