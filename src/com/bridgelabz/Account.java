package com.bridgelabz;
import java.util.Scanner;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Account {
    private double savingsBalance=0;
    private double interestRate=0;
    private double newinterestRate=5.0;
    public Account(double interestRate,double savingsBalance ){
        this.savingsBalance=savingsBalance;
        this.interestRate=interestRate;
    }
    void get() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1 to get balance");
        System.out.println("enter 2 to get balance with existing interest");
        System.out.println("enter 3 to get balance with new interest of next month");
        int a = scan.nextInt();
        if(a==1) {
                System.out.println("your savings balance is= " + savingsBalance);
        }
        if (a == 2) {
                double interest = savingsBalance * interestRate / 12;
                savingsBalance += interest;
                System.out.println("your savings balance is= " + savingsBalance);
        }
        if(a==3){
            System.out.println("Before interest balance is: "+savingsBalance);
            double interest = savingsBalance * newinterestRate / 12;
            savingsBalance += interest;
            System.out.println("your next month savings balance with interest is= " + savingsBalance);
        }
    }
}