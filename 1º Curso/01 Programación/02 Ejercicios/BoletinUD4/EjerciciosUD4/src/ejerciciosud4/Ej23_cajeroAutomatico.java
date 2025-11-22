/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 * Apartado 23
 * @author Ulises III
 */
public class Ej23_cajeroAutomatico {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido al banco , pida el dinero ");
        
        int dineroSolicitado= teclado.nextInt(); 
        int billeteCien=0;
        int billeteCincuenta=0;
        int billeteVeinte=0;
        int billeteDiez=0;
        int billeteCinco=0;
        int monedaDos=0;
        int monedaUno=0;
        int resto = 0;
        
        System.out.println("El valor pedido a sido " + dineroSolicitado);
        System.out.println("Espera por favor....");
        
 
        if ( dineroSolicitado > 0){
          
              if ( dineroSolicitado > billeteCien){
                  
             billeteCien = dineroSolicitado / 100 ; 
             resto = dineroSolicitado % 100;
                System.out.println(billeteCien + " billetes de 100 euros");
        }
           
          if ( dineroSolicitado > billeteCincuenta){
              billeteCincuenta = resto / 50 ;
              resto = resto % 50;
                System.out.println(billeteCincuenta + " billetes de 50 euros");   
            }
                
            
        if ( dineroSolicitado > billeteVeinte){
              billeteVeinte = resto / 20;
                resto = resto % 20;
            System.out.println(billeteVeinte + " billetes de 20 euros");
        }
     
          if ( dineroSolicitado > billeteDiez){
               billeteDiez = resto / 10 ;
                 resto = resto % 10;
            System.out.println(billeteDiez + " billetes de 10 euros");
        }
         
             if ( dineroSolicitado > billeteCinco){
                      billeteCinco = resto / 5;
                   resto = resto % 5;
            System.out.println(billeteCinco + " billetes de 5 euros");
        }
           
                  if ( dineroSolicitado > monedaDos){
                monedaDos = resto / 2 ;
                  resto = resto % 2;
            System.out.println(monedaDos + " monedas de 2 euros");
        }
                
        if ( dineroSolicitado > monedaUno){
           monedaUno = resto / 1 ;  
             resto = resto % 1;
            System.out.println(monedaUno + " monedas de 1 euros");
        }
                
            
            
        }
        
      
      
            
    }
    
    
    
}
