/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.bankpolymorphism;

import edu.blackburn.cs.cs212sp16.bankv2.*;

/**
 *
 * @author joshua.gross
 */
public class Money {
    
    private String currency;
    private double amount;

    public Money(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
    
    public Money add(Money m) {
        return new Money(this.currency, this.getAmount() + m.getAmount());
    }
    
    public Money subtract(Money m) {
        return new Money(this.currency, this.getAmount() - m.getAmount());    
    }
   
    
    public String toString() {
        return this.currency + this.amount;
    }
    
}
