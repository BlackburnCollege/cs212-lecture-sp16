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
public class Runner {
    public static void main(String[] args) {
        Basketball basketball = new Basketball();
        printBall(basketball);
        
        Football ft = new Football();
        printBall(ft);
        
        Rectangle r1 = new Rectangle(10, 5);
        r1.setLength(4);
        System.out.println(r1);
        lengthen(r1);
        System.out.println(r1);
        
        Square s1 = new Square(7);
        System.out.println(s1);
        lengthen(s1);
        System.out.println(s1);     
    }
    
    public static void lengthen(Rectangle r) {
        r.setLength(r.getLength()*2);
    }
    
    
    public static void printBall(Ball ball) {
        System.out.println(ball);
        System.out.println(ball.getCircumference());
    }
    
}
