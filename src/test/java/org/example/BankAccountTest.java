package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void createAccountTest(){
        BankAccount joshBankAccount = new BankAccount( 500,"Josh", BankAccount.AccType.SAVINGS);
        BankAccount nothandoBankAccount = new BankAccount( 5000,"Nothando", BankAccount.AccType.SAVINGS);
        assertEquals("Josh", joshBankAccount.getAccHolderName());
        assertEquals(5000, nothandoBankAccount.getBalance());
    }

    @Test
    void depositTest(){
        BankAccount joshBankAccount = new BankAccount( 500,"Josh", BankAccount.AccType.SAVINGS);
        joshBankAccount.deposit(1000);
        assertEquals(1500, joshBankAccount.getBalance());

    }

    @Test
    void withdrawTest(){
        BankAccount nothandoBankAccount = new BankAccount( 5000,"Nothando", BankAccount.AccType.SAVINGS);
        nothandoBankAccount.withdraw(1000);
        assertEquals(4000, nothandoBankAccount.getBalance());
    }

    @Test
    void depositNegativeTest() throws Exception{
        BankAccount joshBankAccount = new BankAccount( 500,"Josh", BankAccount.AccType.SAVINGS);
        joshBankAccount.deposit(1000);
        assertEquals(1500, joshBankAccount.getBalance());
        assertThrows(IllegalArgumentException.class, ()->joshBankAccount.deposit(-5000));
    }

    @Test
    void createCurrentAccTest(){
        BankAccount joshBankAccount = new CurrentAccount( 500,"Josh", BankAccount.AccType.SAVINGS, 250);
        joshBankAccount.deposit(1000);
        assertEquals(1500, joshBankAccount.getBalance());
        assertThrows(IllegalArgumentException.class, ()->joshBankAccount.deposit(-5000));
    }

    @Test
    void createSavingsAccTest(){
        BankAccount joshBankAccount = new SavingsAcc( 500,"Josh", BankAccount.AccType.SAVINGS, 250);
        joshBankAccount.deposit(1000);
        assertEquals(1500, joshBankAccount.getBalance());
        assertThrows(IllegalArgumentException.class, ()->joshBankAccount.deposit(-5000));
    }
}


