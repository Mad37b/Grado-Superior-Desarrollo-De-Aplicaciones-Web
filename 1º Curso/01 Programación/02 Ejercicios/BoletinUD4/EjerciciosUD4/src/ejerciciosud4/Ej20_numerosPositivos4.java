package ejerciciosud4;

import java.util.Scanner;

/**
 *Apartado 20
 * @author Ulises III
 */
public class Ej20_numerosPositivos4 {
    
    public static void main(String[] args) {
   
        Scanner teclado = new Scanner (System.in);
        int numero = 0;
        int veces = 0;
        while ( veces < 5){
            System.out.println("Bienvenido de nuevo al cuarto programa de numeros positivos");
            System.out.println("introduce el numero");
              numero = teclado.nextInt() ; 
        if ( numero <0 ){
            System.out.println("el numero es positivo"); 
            
        }
        
        for ( int i = 0 ; i < veces ; i++){
            
        }
          System.out.println("los numeros han sido " + numero); 
        veces++;
        }
        
        int valorMax = Math.max(numero, veces);
        int valorMin = Math.min(numero, veces);
        System.out.println("El numero máximo a sido " + valorMax);
        System.out.println("El numero minimo a sido " + valorMin);
        
        
    }
    
}
