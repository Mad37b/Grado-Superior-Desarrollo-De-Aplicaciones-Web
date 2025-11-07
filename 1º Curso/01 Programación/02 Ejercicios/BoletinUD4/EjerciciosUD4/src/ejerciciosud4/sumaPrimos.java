/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 *
 * @author Ulises III
 */
public class sumaPrimos {

    public static void main(String[] args) {
        
        /**
         * 
         * 17. Hacer un programa que calcule y escriba la suma de los números pares por un lado, y de los impares por
            otro, de los números comprendidos entre 1 y 1000, ambos incluidos. Programarlo de dos maneras
            diferentes: con 2 bucles y con 1 bucle.
        
        **/
        Scanner teclado = new Scanner ( System.in);
        int valor = teclado.nextInt();
        // pares
        
        if ( valor >= 0 ) {
        
        
            if( valor %2 ==0){

               System.out.println("Par");

                int valorMax = Math.max(valor, 1000);
                for ( int i = 0 ; valorMax > i; i++){
                    valor +=2;
                    System.out.println("indice - "+ i +" - valor par =" + valor);

   
                    if ( valor == 1000){
                     return;   
                    }

                }

            }else{
                System.out.println("Impar");

                int valorMax = Math.max(valor, 1000);
                for ( int i = 0 ; valorMax > i; i++){
                 
                  
                    valor +=2;
                    System.out.println("indice - "+ i +" - valor impar =" +valor);
                    
                    if ( valor == 1000){
                     return;   
                    }

                }
            }
        }
    }
}