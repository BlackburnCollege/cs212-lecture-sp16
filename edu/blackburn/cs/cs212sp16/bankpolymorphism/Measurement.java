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
public class Measurement {
    
    private String unit;
    private double value;
    
    public Measurement (String unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return this.unit;
    }

    public double getValue() {
        return this.value;
    }
    
    
}
