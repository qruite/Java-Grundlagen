package Inheritance.AufgabeKonto.at.grm.cc.accounts;

public class SavingAccount extends BaseAccount{
    private double balance;
    private double savingRate;

    public void calculateSavings(){
        this.balance += this.balance * this.savingRate / 100;
    }
}
