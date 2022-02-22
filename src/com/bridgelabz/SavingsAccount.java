package com.bridgelabz;

import java.util.Scanner;

public class SavingsAccount {
    static double annualInterestRate;
    static double savingsBalance;
    public static void main(String [] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter annual interest rate");
        annualInterestRate=scan.nextDouble();
        System.out.println("Enter Customer ID");
        int id=scan.nextInt();
        Balance b=new Balance();
        savingsBalance=b.getBalance(id);
        System.out.println(savingsBalance);
        Account a = new Account(annualInterestRate, savingsBalance);
        a.get();
    }
}
