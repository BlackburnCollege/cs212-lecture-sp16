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

    public static void main(String[] args) {
        BadPrimeGenerator bpg = new BadPrimeGenerator();

        long start = System.currentTimeMillis();
        for (long value = 2; value < 1000000; value++) {
            if (bpg.isPrime(value)) {
                System.out.println(value + " is prime");
            } else {
                System.out.println(value + " is not prime");
            }
        }
        long value = 5473987776L;
        long runlen = System.currentTimeMillis() - start;
        System.out.println("Took " + runlen + " milliseconds");

    }

}
