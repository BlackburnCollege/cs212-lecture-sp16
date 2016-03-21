/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.arraylist;

import java.util.Random;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        for (int i = 0; i < Integer.MAX_VALUE - 1; i++) {
            al.add(Account.getRandom());
        }
        
        Account a = (Account) al.get(10);
        System.out.println(a.getId());
    }
    
}

//class Account {
//    private int id;
//    private static final Random RAND = new Random();
//    
//    public Account() {
//        // found code at http://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
//        this.id = RAND.nextInt(1000);
//    }
//    
//    public int getId() {
//        return this.id;
//    }
//}