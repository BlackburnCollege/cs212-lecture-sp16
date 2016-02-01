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
public class Account {
    
    private String id;
    private Person owner;
    
    public Account(Person owner, String id) {
        this.owner = owner;
        this.id = id;
    }
    
    public Account() {
        
    }
    
    public Person getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return "SSN: " + this.getOwner().getSsn() + " Account ID: " + this.getId();
    }
    
    public String getId() {
        return id;
    }
    
    
}
