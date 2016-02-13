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
public abstract class Ball {
    
    private int radius;
    
    public Ball(int radius) {
        this.radius = radius;
    }
    
    public int getCircumference() {
        return this.radius * 2 * (int) Math.PI;
    }
    
}
