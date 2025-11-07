/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
 import java.util.Scanner;
/**
 *Apartado 3
 * @author Ulises III
 */
public class coordenadas {
      public static void main(String[] args) {
          
       double x;   
       double y;
       double intercambio;
       Scanner teclado = new Scanner ( System.in);
   
         x = teclado.nextDouble();
         y = teclado.nextDouble();
         
         // intercambio 
         
         intercambio = x;
         x = y;
         y = intercambio;
         
          
          
      }
}
