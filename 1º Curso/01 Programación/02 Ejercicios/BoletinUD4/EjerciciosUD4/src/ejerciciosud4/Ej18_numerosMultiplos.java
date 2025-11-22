/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 *Apartado 18
 * @author Ulises III
 */
public class Ej18_numerosMultiplos {
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
         int numero = teclado.nextInt() ; 
         int multiplo= 1;
            System.out.print("numeros multiplos de " + numero +" = ");
         for ( int i = 0 ; i < 4; i++){
             
             multiplo = numero * i;
    
             System.out.print(multiplo + ",");        
         }
    }
}
