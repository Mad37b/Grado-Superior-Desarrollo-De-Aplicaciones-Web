/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
 import java.util.Scanner;
/**
 *Apartado 4
 * @author Ulises III
 */
public class numeroPositivo {
    
    
   
        
          public static void main(String[] args) {
               
        Scanner teclado = new Scanner ( System.in);
        double numero= teclado.nextDouble(); 
        double retencionPorcentaje= 0.2;
              
              
              if ( numero >= 0 ){
                  System.out.println("El numero es positivo" + numero);
          }else{
                  System.out.println("El numero es negativo" + numero);   
              }
              
              
          }
    
}
