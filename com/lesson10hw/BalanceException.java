package com.lesson10hw;

public class BalanceException extends Exception {

    private long balance;

    public BalanceException(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }
}
