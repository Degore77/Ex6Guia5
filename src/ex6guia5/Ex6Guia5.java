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
        System.out.println("");
        numeros(sopaMat);
        mosMat(sopaMat);
        
        
        
    }
    
    public static String[] cargVec(String[] palVec, Scanner leer){
        System.out.println("Ingrese palabras entre 3 y 5 caracteres");
        for (int i = 0; i < palVec.length; i++) {
            palVec[i] = leer.next();
            ///System.out.print("["+palVec[i]+"]");
            ///System.out.println(" ");
        }
        return palVec;
    
    }
    
    public static String[][] sopaLet(String[] palVec, String[][] sopaMat){
        int aux;
        int aux2;
        for (int i = 0; i < palVec.length; i++) {
            aux = (int)(Math.random()*19);
            aux2 = (int)(Math.random()*14);
            for (int j = 0; j < palVec[i].length() ; j++) {
                sopaMat[aux][aux2+j] = palVec[i].substring(j,j+1);
                
            }
            
        }
        
    return sopaMat;
    }
    public static void mosMat(String[][] sopaMat){
        for (int i = 0; i < sopaMat.length; i++) {
            for (int j = 0; j < sopaMat.length; j++) {
                System.out.print(sopaMat[i][j]+" ");
                
            }
            System.out.println(" ");
        }
    }
    
    public static String[][] numeros(String[][] sopaMat){
        int aux;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                aux = (int)(Math.random()*9);
                if (sopaMat[i][j] == null){
                    sopaMat[i][j] = Integer.toString(aux);
                }
                
            }
            
        }
        return sopaMat;
    }
    
    
}
