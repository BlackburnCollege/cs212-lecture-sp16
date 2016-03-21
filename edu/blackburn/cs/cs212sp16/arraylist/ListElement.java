/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.arraylist;

/**
 *
 * @author joshua.gross
 */
public class ListElement {
    private ListElement nextElement = null;
    
    private Account account = null;
    
    public ListElement(Account account) {
        this.account = account;
    }
    
    public ListElement getNext() {
        return nextElement;
    }
    
    public void addToEnd(Account a) {
        if(nextElement != null) {
            nextElement.addToEnd(a);
        } else {
            this.nextElement = new ListElement(a);
        }
    }

    
}
