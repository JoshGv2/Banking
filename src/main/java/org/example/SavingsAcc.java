package org.example;

public class SavingsAcc extends BankAccount {
    private double interestRate;

    public SavingsAcc(double bal, String accHolderName, AccType current, double interestRate) {
        super(bal, accHolderName, current);

        setInterestRate(interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate<0){
            throw new IllegalArgumentException("You're getting scammed by your bank!");
        }
        this.interestRate = interestRate;
    }
}
