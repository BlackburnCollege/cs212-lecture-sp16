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
public class Square extends Rectangle {
    
    public Square(int side) {
        super(side, side);
    }
    
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }
    
    @Override
    public void setLength(int length) {
        super.setWidth(length);
        super.setLength(length);
    }
}
