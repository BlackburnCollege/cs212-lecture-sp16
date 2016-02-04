/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.bankv2;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        Account a = new Account(new Money("donuts", 12));
        System.out.println("a's balance = " + a.getBalance());
    }
}
