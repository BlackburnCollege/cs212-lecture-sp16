/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.liskov;

/**
 *
 * @author joshua.gross
 */
public abstract class SportsBall extends Ball {
    
    private String sport;
    
    public SportsBall(String sport, int radius) {
        super(radius);
        this.sport = sport;
    }
    
}
