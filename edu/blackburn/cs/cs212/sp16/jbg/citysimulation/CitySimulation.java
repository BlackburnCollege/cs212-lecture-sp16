/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.sp16.jbg.citysimulation;

/**
 * la la la changes
 * @author joshua.gross
 */
public class CitySimulation {

    /**
     * what happened to my comment?
     * I'm changing things again
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberOfIceCreamBars = 100;
        Freezer freezer = new Freezer(numberOfIceCreamBars);
        IceCreamBar bar = new IceCreamBar();
        for (int i = 0; i <= numberOfIceCreamBars; i++) {
           freezer.addStock(bar);
        }
    }
    
}
