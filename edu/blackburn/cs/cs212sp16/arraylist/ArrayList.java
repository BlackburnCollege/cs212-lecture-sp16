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
public class ArrayList {
    
    private int size = 10;
    private int count = 0;
    private Object [] arr = new Object[size];
    
    public void add(Object o) {
        if(this.count >= this.size) {
            this.resizeArray();
        }
        this.arr[this.count] = o;
        this.count++;
    }
    
    public Object get(int index) {
        return this.arr[index];
    }
    
    private void resizeArray() {
        int newSize = this.size * 2;
        System.out.println("resizing array to " + newSize);
        Object [] newArr = new Object[newSize];
        for(int i = 0; i < this.size; i++){
            newArr[i] = this.arr[i];
        }
        this.size = newSize;
        this.arr = newArr;
    }
}
