/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.sp16.threadedprimes;

/**
 *
 * @author joshua.gross
 */
public class PrimeRunner {

    private long start;
    private long count;
    private long current;
    private int generatorCount = 2;

    public PrimeRunner(long start, long count) {
        this.start = start;
        this.count = count;
        this.current = this.start;
        BadPrimeGenerator[] bpgs = 
                new BadPrimeGenerator[this.generatorCount];
        
        for(int i = 0; i < bpgs.length; i++ ) {
            bpgs[i] = new BadPrimeGenerator(this, i);
            new Thread(bpgs[i]).start();
        }
    }

    public synchronized long getNext() {
        return current++;
    }

    public static void main(String[] args) {
        new PrimeRunner(100000, 100);
    }

}
