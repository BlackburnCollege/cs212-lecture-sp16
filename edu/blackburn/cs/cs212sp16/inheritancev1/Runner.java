/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.inheritancev1;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    
    public static void main(String[] args) {
        Person p = new Person("Braydon", "L", "Rekart", "123-45-678");
        CheckingAccount a = new CheckingAccount(p, "E137A");
        System.out.println("a's ssn = " + p.getSsn());
        System.out.println(a);
        
//        CheckingAccount b = new CheckingAccount("5555555", "A");
//        System.out.println("b's ssn = " + b.getSsn());
        
        //b.setSsn("4444444");
        //System.out.println("b's ssn = " + b.getSsn());
        
//        System.out.println(b);
    }
    
}
