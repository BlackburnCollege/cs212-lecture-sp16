/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cscourses.cs212.sp16.jbg;

import java.io.*;

/**
 *
 * @author joshua.gross
 */
public class Cs21201FunJavaStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 10;
        while (true) {
            System.out.println(count);
            //count = count - 1;
            if (count < 1) {
                break;
            }
            count--;
        }

        for (count = 10; count > 1; count--) {
            System.out.println(count);
        }

    }

    public void foo() {
        File[] files = new File [1];
        for (int i = 0; i < files.length; i++) {
            FileReader fr = null;
            try {
                fr = new FileReader(files[i]);
            } catch (FileNotFoundException e) {
                System.err.println("I can't find the file!");
            }
                if (fr != null) {
            try {
                    fr.close();
            } catch (IOException e) {
                System.err.println("I can't close the file!");
            }
                }
        }
    }
}
