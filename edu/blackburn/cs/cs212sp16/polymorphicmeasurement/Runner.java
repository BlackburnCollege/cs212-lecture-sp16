/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.polymorphicmeasurement;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        Volume [] amounts = new Volume[4];
        amounts[0] = new Gallon(-5);
        amounts[1] = new Gallon(2.5);
        amounts[2] = new Teaspoon(3);
        amounts[3] = new Milliliter(500);
        Volume v = sum(amounts);
    }
    
    public static Volume sum(Volume [] arr) {
        
        return new Volume("whatevers", 1);
    }
    
    
    
}
