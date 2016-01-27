/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.sp16.inheritance;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    
    public static void main(String[] args) {
        Account a = new Account("123456");
        System.out.println("a's ssn = " + a.getSsn());
        
        CheckingAccount b = new CheckingAccount("5555555");
        System.out.println("b's ssn = " + b.getSsn());
        
        b.setSsn("4444444");
        System.out.println("b's ssn = " + b.getSsn());
        
    }
    
}
