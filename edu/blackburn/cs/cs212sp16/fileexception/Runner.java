/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fileexception;

import java.io.*;

/**
 *
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        try {
            FileReader fr = 
                    new FileReader("blackburn-cs212-sp16/edu/blackburn/cs/cs212sp16/fileexception/itsafile.txt");
            BufferedReader br = new BufferedReader(fr);
            String tmp = "here's your file:";
            do {
                System.out.println(tmp);
                tmp = br.readLine();
            } while(tmp != null);
        } catch(Exception e) {
            System.out.println("I found an exception!");
            System.out.println(e);
            System.out.println("You are a bad programmer :(");
        }
    }
}
