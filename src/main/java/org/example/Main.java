package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String[] args ) throws Exception {
        //create instances of accounts
        BankAccount nothCurrAcc = new CurrentAccount(5000, "Nothando Tshuma", BankAccount.AccType.CURRENT, 500);
        BankAccount joshCurrAcc = new CurrentAccount(7000, "Joshua George", BankAccount.AccType.CURRENT, 700);

        SavingsAcc nothSavingsAcc = new SavingsAcc(100, "Nothando Tshuma", BankAccount.AccType.SAVINGS, 0.5);
        SavingsAcc joshSavingsAcc = new SavingsAcc(100, "Joshua George", BankAccount.AccType.SAVINGS, 0.5);

        //add them to arrayList
        List<BankAccount> bankAccounts = new ArrayList<>();

        bankAccounts.add(nothCurrAcc);
        bankAccounts.add(joshCurrAcc);
        bankAccounts.add(nothSavingsAcc);
        bankAccounts.add(joshSavingsAcc);

        //print info about accounts
        for (BankAccount acc : bankAccounts){
            acc.printInfo();
        }

        //add interest
        nothSavingsAcc.addInterestToBal();
        System.out.println("Nothando's balance after adding interest: " + nothSavingsAcc.getBalance());

        joshSavingsAcc.addInterestToBal();
        System.out.println("Josh's balance after adding interest: " + joshSavingsAcc.getBalance() + "\n");

        //remove interest
        nothSavingsAcc.deductInterestToBal();
        System.out.println("Nothando's balance after removing interest: " + nothSavingsAcc.getBalance());

        joshSavingsAcc.deductInterestToBal();
        System.out.println("Josh's balance after removing interest: " + joshSavingsAcc.getBalance() + "\n");

        //testing CustomException
        CurrentAccount nothExceptionAcc = new CurrentAccount(5000, "Nothando Tshuma", BankAccount.AccType.CURRENT, -10);
        CurrentAccount joshExceptionAcc = new CurrentAccount(5000, "Josh George", BankAccount.AccType.CURRENT, 0);
    }
}
