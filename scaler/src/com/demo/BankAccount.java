package com.demo;

import java.util.List;

public class BankAccount {
    private double balance;
    private double interestRate;
    private List<Integer> transactions;

    BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    void withdraw(double amount) {
        if(amount > 0) balance -= amount;
    }
    void deposit(double amount) {
        if(amount > 0 && amount <= balance) balance += amount;
    }
    void showBalance() {
        System.out.println(balance);
    }
}
