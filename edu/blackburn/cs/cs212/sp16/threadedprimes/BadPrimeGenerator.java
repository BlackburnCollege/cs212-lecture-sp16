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
public class BadPrimeGenerator implements Runnable {
    
    private PrimeRunner pr;
    private int label;
    public BadPrimeGenerator(PrimeRunner pr, int label) {
        this.pr = pr;
        this.label = label;
    }

    @Override
    public void run() {
        while(true) {
            long l = this.pr.getNext();
            this.isPrime(l);
        }
    }
    
    public void isPrime(long origin) {
        for (long current = origin-1; current > 1; current-- ) {
            if(origin % current == 0) {
                System.out.println(label +
                        " determined that " + origin +
                        " is not prime");
                return;
            }
        } 
        System.out.println(label +
                        " determined that " + origin +
                        " is prime");
    }
    
}
