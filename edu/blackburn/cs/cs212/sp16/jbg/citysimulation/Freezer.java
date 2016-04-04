/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.sp16.jbg.citysimulation;

/**
 *
 * @author joshua.gross
 */
public class Freezer {
    private IceCreamBar [] stock;
    private int indexOfStock = 0;
    
    public Freezer(int amountOfIceCreamBars) {
        this.stock = new IceCreamBar[amountOfIceCreamBars];
    }
    
    public void addStock(IceCreamBar bar) {
        this.stock[this.indexOfStock] = bar;
        this.indexOfStock++;
    }
    
}
