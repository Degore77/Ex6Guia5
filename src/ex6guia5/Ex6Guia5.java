/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6guia5;

import java.util.Scanner;

/**
 *
 * @author demia
 */
public class Ex6Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] palVec = new String[5];
        String[][] sopaMat = new String[20][20];
        cargVec(palVec,leer);
        sopaLet(palVec,sopaMat);
        
        
        
    }
    
    public static String[] cargVec(String[] palVec, Scanner leer){
        System.out.println("Ingrese palabras entre 3 y 5 caracteres");
        for (int i = 0; i < palVec.length; i++) {
            palVec[i] = leer.next();
            System.out.print("["+palVec[i]+"]");
            System.out.println(" ");
        }
        return palVec;
    
    }
    
    public static String[][] sopaLet(String[] palVec, String[][] sopaMat){
        
        for (int i = 0; i < palVec.length; i++) {
            
            
        }
        
    return sopaMat;
    }
    
}
