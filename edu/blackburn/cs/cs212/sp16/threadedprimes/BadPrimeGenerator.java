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
public class BadPrimeGenerator {
    
    public BadPrimeGenerator() {
        
    }
    
    public boolean isPrime(long origin) {
        for (long current = origin-1; current > 1; current-- ) {
            if(origin % current == 0) {
                return false;
            }
        }
        return true;
    }
    
}
