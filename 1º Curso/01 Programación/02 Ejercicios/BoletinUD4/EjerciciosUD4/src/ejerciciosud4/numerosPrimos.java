/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 26
 * @author Ulises III
 */
public class numerosPrimos {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       
        int numero = teclado.nextInt();
    int divisores = 0;
        if ( numero <=-1) {
            
            System.out.println("el numero introducido no es positivo" + numero);
        }
        
        
        
        
        
        
        
        
        // verifica si es numero es primo 
        for (int i = 1; i <= numero; i++) {
            
                   if (  numero % i == 0){
                     divisores++;
                   }
 
        }
      
            if (divisores == 2) {
               
                 System.out.println("el numero " + numero + " es primo");
            
             }else{ System.out.println(" el numero " + numero + " no es primo");}
            
                           
  
        
        
    }
    
    
}
