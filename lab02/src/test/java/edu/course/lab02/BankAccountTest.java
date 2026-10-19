package edu.course.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void withdrawSuccess() {
        BankAccount account = new BankAccount(100);
        account.withdraw(30);
        assertEquals(70, account.getBalance());
    }

    @Test
    void withdrawMoreThanBalance() {
        BankAccount account = new BankAccount(50);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100));
        assertEquals(50, account.getBalance());
    }

    @Test
    void negativeInitialBalance() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(-1));
    }

    @Test
    void depositZero() {
        BankAccount account = new BankAccount(10);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
    }
}
