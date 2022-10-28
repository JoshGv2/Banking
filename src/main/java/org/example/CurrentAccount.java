package org.example;

public class CurrentAccount extends BankAccount {
    private double maxWithdrawAmt;

    public CurrentAccount(double bal, String accHolderName, AccType current, double intmaxWithdrawAmt) {
        super(bal, accHolderName, current);

        setMaxWithdrawAmt(maxWithdrawAmt);
    }

    public double getMaxWithdrawAmt() {
        return maxWithdrawAmt;
    }

    public void setMaxWithdrawAmt(double maxWithdrawAmt) {
        if(maxWithdrawAmt<0){
            throw new IllegalArgumentException("Your maximum withdraw amount needs to be higher");
        }
        this.maxWithdrawAmt = maxWithdrawAmt;
    }
}



