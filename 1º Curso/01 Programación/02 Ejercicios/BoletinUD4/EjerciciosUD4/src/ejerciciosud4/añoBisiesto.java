/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 * Apartado 13
 * @author Ulises III
 */
public class añoBisiesto {
    
    /** Crea un programa que lea si un año es bisiesto o no **/
    
    public static void main(String[] args) {
        
            Scanner teclado = new Scanner (System.in);
    
   int añoBisiesto= teclado.nextInt();
    if ( añoBisiesto >= 0){   // no puede ser negativo
        System.out.println("El el ano es positivo");
            if (añoBisiesto % 4 == 0){

                  System.out.println("el año a sido bisiesto :" + añoBisiesto);
         }else{
                System.out.println("el año NO a sido bisiesto" + añoBisiesto);   
            }
   }else{
    
       System.out.println("El ano no puede ser NEGATIVO");
    }
        
    }
    
}
