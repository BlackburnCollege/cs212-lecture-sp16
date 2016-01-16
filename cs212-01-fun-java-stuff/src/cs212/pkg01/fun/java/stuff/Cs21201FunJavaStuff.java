/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs212.pkg01.fun.java.stuff;

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
        while(true) {
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
    
}
