package edu.blackburn.cscourses.cs212.sp16.jbg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
// package name:
// reverse domain name
// add subpackages for different projects, people, sections of systems

/**
 *
 * @author joshua.gross
 */
public class WrapperTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        Integer iObject = new Integer(i);
        
        Integer jObject = Integer.decode("2");
        int j = jObject.intValue();
        
        System.out.println("i: " + i + " j: " + j);
        System.out.println("iObject: " + iObject + " jObject: " + jObject);
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(iObject);
        list.add(jObject);
        
        int k = jObject;
        double u = 5;
        //int v = u;
        
        System.out.println("k: " + k);
        
        list.add(k);
        i++;
        j++;
        System.out.println("i: " + i + " j: " + j);
        System.out.println("iObject: " + iObject + " jObject: " + jObject);
    }
    
}
