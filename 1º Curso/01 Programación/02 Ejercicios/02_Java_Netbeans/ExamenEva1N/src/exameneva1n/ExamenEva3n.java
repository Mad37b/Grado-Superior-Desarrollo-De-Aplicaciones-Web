/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameneva1n;
import java.util.Scanner;
/**
 * 3 Numeros descendentes
 * @author Ulises III
 */
public class ExamenEva3n {
    
    
    public static void main (String[] arg){
        
        
        int numero = 0 ; 
        int total = 0 ; 
        
        Scanner teclado = new Scanner ( System.in);
        
        System.out.println(" Escribe el primer numero");
        
        int valor1 = teclado.nextInt();
        
           System.out.println(" Escribe el segundo numero");
        
        int valor2 = teclado.nextByte();
        
       if(valor1 % 5 == 0 ){
              if(valor2 % 5 == 0 ){
            
                  
                  // ver cual es el mayor 
                  int valorMax = Math.max( valor1, valor2);
                  int valorMin = Math.min( valor1, valor2);
                  
               
                        //System.out.println("entro aqui" + valorMin);
           // si es divisible hacemos la descendencia
           
                 total = valorMax;
                 for ( int i = valorMax ; i > valorMin  ; i--){ // opcionalmente puede ser mejor práctica usar while
            
                     
                     total -= 5;
                     
                     System.out.print(" " + total+",");
                  if ( total == valorMin){
                      System.out.println("\n"+"Salgo del for");
                      break;
                  }
                     
            // aqui me da los numeros descendientes
            
                }
                
              }else{
           System.out.println("El valor 2 no es divisible entre 5");
       
       }
       }else{
           System.out.println("El valor 1 no es divisible entre 5");
           return;
       }
  // acaba aqui --------------------
        
    }
    
}
