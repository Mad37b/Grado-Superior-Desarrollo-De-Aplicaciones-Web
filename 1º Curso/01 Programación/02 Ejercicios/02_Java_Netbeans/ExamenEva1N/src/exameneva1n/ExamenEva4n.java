/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameneva1n;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 */
public class ExamenEva4n {
    
    public static void main ( String [] arg){
        
                int numero;
                int r = 0;
         Scanner teclado = new Scanner(System.in);

         System.out.print("Introduce numeros: ");
         numero = teclado.nextInt();
         while (numero != 0) { // creo que hay que pasarlo a for y ya esta ... 
         r += numero;
         numero = teclado.nextInt();
         }
         System.out.println("El resultado de la suma es: " + r);
        
    }
    
}
