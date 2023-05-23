package Inheritance.AufgabeKonto.at.grm.cc.accounts;

public class BaseAccount {
    private double balance;

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        double check = this.balance - amount;
        if(check < 0){
            System.out.println("Das ist ein Girokonto und kann nicht negativ sein");
        } else {
            this.balance = check;
        }
    }

    public double getBalance(){
        return balance;
    }

    
}
