package edu.blackburn.cs.cs212sp16.memorytracing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joshua.gross
 */
public class Runner {

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        increment(i);
        System.out.println(i);

        Holder h1 = new Holder("CS212", 100);
        System.out.println(h1);
        mutateHolder(h1);
        System.out.println(h1);

        changeHolder(h1);
        System.out.println(h1);

    }

    static void mutateHolder(Holder h1) {
        h1.setName("CS254");
        h1.setValue(-500);
    }

    static void changeHolder(Holder h1) {
        h1 = new Holder("MA254", -1000000);
        System.out.println(h1);

    }

    static void increment(int i) {
        i++;
    }

}

class Holder {

    private int value;
    private String name;

    public Holder(String name, int value) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + super.toString() + "\tName: " + this.getName()
                + "\tValue: " + this.getValue();
    }

}
