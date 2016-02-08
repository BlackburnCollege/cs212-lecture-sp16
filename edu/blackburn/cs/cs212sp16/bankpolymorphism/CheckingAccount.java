/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.bankpolymorphism;

/**
 *
 * @author joshua.gross
 */
public class CheckingAccount extends Account {

    private int maxCheck = 5;
    private int currentCheck = 1;

    public CheckingAccount(Money balance) {
        super(balance);
    }

    @Override
    public void deposit(Money m) {
        this.credit(m);
    }

    @Override
    public void withdraw(Money m) {
        if (this.currentCheck <= this.maxCheck) {
            this.debit(m);
            this.currentCheck++;
        }
    }

}
