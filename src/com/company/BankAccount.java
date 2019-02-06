package com.company;

/**
 * Created by dpennebacker on 2/1/17.
 */
public class BankAccount {

    public BankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }

    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public String name;
    public double balance;
}