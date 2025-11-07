/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 * Apartado 21
 * @author Ulises III
 */
public class piramideFloyd {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numeroF = teclado.nextInt();
        int contador = 1;
        // numeroF es numero de fila
        int total =  (numeroF + 1) / 2;
        
        for (int i = 0; i < numeroF; i++) {
            for (int j = 0; j <= i; j++) { // con <= tambien da la vuelta con cero
               
                 System.out.print(contador);    
            contador++;
           
           
          
            }
            System.out.println(" ");
                 
        }
   
        
        
    }
}
