/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.bankv2;

/**
 *
 * @author joshua.gross
 */
public abstract class Account {
    
    private Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }
    
    private void setBalance(Money m) {
        
    }
    
    public Money getBalance() {
        return new Money("francs", 2500000);
    }
    
    protected void debit(Money m) {
        
    }
    
    protected void credit(Money m) {
        
    }
    
    public void deposit(Money m) {
        
    }
    
    public void withdraw(Money m) {
        
    }
    
}
