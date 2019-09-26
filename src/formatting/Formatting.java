/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatting;

/**
 *
 * @author 
 * Nama : Permai Ramadhan
 * Kelas : IF 2
 * NIM : 10118060
 * Deskripsi Program : Formatting
 */
public class Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -1;
        System.err.println("i : " + i);
        System.err.printf("%%d : %d%n", i);
        System.err.printf("%%10d : %10d%n", i);
        System.err.printf("%%+10d : %+10d%n", i);
        System.err.printf("%%+10d : %+10d%n", iMinus);
        System.err.printf("%%,10d : %,10d%n", i);
        System.err.printf("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.err.printf("f : ", + f);
        System.err.printf("%%f : %f%n", f);
        System.err.printf("%%.2f : %.2f%n", f);
        System.err.printf("%%12.2f : %12.2f%n", f);
        System.err.printf("%%,12.2f : %,12.2f%n", f);
        
        
    }
    
}
