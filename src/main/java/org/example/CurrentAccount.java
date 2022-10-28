package org.example;

public class CurrentAccount extends BankAccount {
    private double maxWithdrawAmt;

    public CurrentAccount(double bal, String accHolderName, AccType current, double intmaxWithdrawAmt) throws Exception {
        super(bal, accHolderName, current);

        setMaxWithdrawAmt(maxWithdrawAmt);
    }

    public double getMaxWithdrawAmt() {
        return maxWithdrawAmt;
    }

    public void setMaxWithdrawAmt(double maxWithdrawAmt) throws Exception{
        try{
            if (maxWithdrawAmt > 0){
                this.maxWithdrawAmt = maxWithdrawAmt;
            } else {
                throw new CustomException("Your maximum withdraw amount needs to be higher");
            }
        } catch(CustomException e) {
            System.out.println(e);
        }
    }
}



