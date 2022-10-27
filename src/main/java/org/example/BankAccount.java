package org.example;

public class BankAccount {
    private double Balance;
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
    }




}
