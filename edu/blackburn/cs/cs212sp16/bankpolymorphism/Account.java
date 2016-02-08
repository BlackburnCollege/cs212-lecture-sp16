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
public abstract class Account {
    
    private Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }
        
    public Money getBalance() {
        return this.balance;
    }
    
    protected final void debit(Money m) {
        this.balance = this.balance.subtract(m);
    }
    
    protected final void credit(Money m) {
        this.balance = this.balance.add(m);        
    }
    
    public abstract void deposit(Money m);
    
    public abstract void withdraw(Money m);
    
}
