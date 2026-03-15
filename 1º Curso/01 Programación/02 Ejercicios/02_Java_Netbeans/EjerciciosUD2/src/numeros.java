/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ulises III
 */

import java.util.Scanner;
public class numeros {
    
    public static void main (String [] arg){
        
     Scanner teclado = new Scanner (System.in);   
        System.out.println("Introduce un valor entero");
        int valorIntegrado = teclado.nextInt();
        
        System.out.println("Introduce el segundo valor entero");
        
        int valorReal = teclado.nextInt();
        
        int conciente1 = valorIntegrado / valorReal;
        System.out.println("Cociente entero = "+ conciente1);
        double conciente2 = (double) valorIntegrado/valorReal;
        System.out.println("Cociente real = " + conciente2);
        int total = valorIntegrado % valorReal;
        System.out.println("numero resto = " + total);
     
    }
    
    
}
