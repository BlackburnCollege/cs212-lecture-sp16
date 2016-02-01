/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.writing;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
//        WritingImplement wi = new WritingImplement();
//        wi.write("some message");
        
        Pen p = new Pen();
        p.write("some message in ink");
        
        Pencil q = new Pencil();
        q.write("some message in lead");
        
        Chalk c = new Chalk();
        c.write("some algebra or something");
        
    }
    
}
