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
public class SavingsAccount extends Account {
    
    public SavingsAccount (Money balance) {
        super(balance);
    }
    
    @Override
    public void deposit(Money m) {
        this.credit(m);
    }

    @Override
    public void withdraw(Money m) {
        this.debit(m);
    }

    
}
