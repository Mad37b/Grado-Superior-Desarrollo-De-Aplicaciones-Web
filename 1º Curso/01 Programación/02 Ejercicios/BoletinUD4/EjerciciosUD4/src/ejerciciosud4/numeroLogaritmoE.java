/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 29 : Numero e ( de los logaritmos) 
 * @author Ulises III
 */
public class numeroLogaritmoE {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int numero = teclado.nextInt(); // por teclado
       double factorial = 1;
       double numeroFactorial = 1 ; 
           double suma = 1.0 ;  // siempre tiene que ser 1.0 para que la factorizacion sea 1/0! en vez 0/0!
        
        
        for (int i = 1; i <= numero; i++) {
             //double n = factorial * i ; // serie armonica del logaritmo
             // numero Factorial
             numeroFactorial = numeroFactorial * i ;
            // Numero e
             double division = 1.0 / numeroFactorial;
             suma += division;
             
     
              //suma acomulada
              //suma += division; // forma serie armonica
       
               System.out.println(" El valor de la iteracion " + i + " es "+suma);
        }
     
        
       
    }
    
    
}
