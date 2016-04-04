/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.sp16.bankv1;

/**
 *
 * @author joshua.gross
 */
public class Money {
    
    private String currency;
    private double value;
    
    public Money(String currency, double value) {
        setCurrency(currency);
    }
    
    public String getCurrency() {
        return this.currency;
    }
    
    private void setCurrency(String currency) {
        currency = this.currency;
    }
    
    public double getValue() {
        return 0;
    }
    
    private void setValue(double value) {
        
    }
    
    
}
