package Inheritance.AufgabeKonto.at.grm.cc.accounts;

public class CreditAccount extends BaseAccount{
    private double balance;
    private double interestRate;

    public void withdraw(double amount){
        double rates = amount * interestRate/100;
        this.balance -= amount + rates;
    }

    public double getInterestRate(){
        return this.interestRate;
    }
}
