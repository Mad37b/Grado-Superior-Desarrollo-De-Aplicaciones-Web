/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 27
 * @author Ulises III
 */
public class Ej27_numerosPrimos2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       int contador = 0 ; 
        int numero = teclado.nextInt();
   
        if ( numero <=-1) {
            
            System.out.println("el numero introducido no es positivo" + numero);
        }
        
        // dime los numeros primos entre 1 y n 
       
        // verifica si es numero es primo 
        for (int i = 2; i <= numero; i++) {
             int divisores = 0;
            
            
            for (int j = 1; j <= i; j++) {
                    if (  i % j == 0){ // para comparar varios valores usar siempre dos indices , cuidado! las variables son valores fijos hasta su cambio pero no
                                        // incrementales 
                     divisores++;
                   }
            }
            
               
            // Saco en bucle los numeros primos 
           if (divisores == 2) { 
                 System.out.println(contador+" - "+i); // cuudado! con solo poner un valor , para  ver varios valores siempre usar los indices y j
             }
                   
                   
              contador++;     
        }
      
         
            
                           
  
        
        
    }
}
