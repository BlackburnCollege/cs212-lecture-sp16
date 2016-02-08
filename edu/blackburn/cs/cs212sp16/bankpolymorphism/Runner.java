/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.bankpolymorphism;


/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        //Account a = new Account(new Money("donuts", 12));
        // can't create an Account because Account is abstract
        CheckingAccount a = new CheckingAccount(new Money("donuts", 12));
        
        System.out.println("a's balance = " + a.getBalance());
        
        Account b = new SavingsAccount(new Money("Danish", 4));
        
        b.deposit(new Money("$", 50));
        
        Account [] allAccounts = new Account[50];
        allAccounts[0] = a;
        allAccounts[1] = b;
    }
}
