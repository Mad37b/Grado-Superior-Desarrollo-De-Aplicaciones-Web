/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exameneva1n;
import java.util.Scanner;
/**
 * 2 - Piramide invertida equilatera
 * @author Ulises III
 */
public class ExamenEva1N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner (System.in);        
        System.out.println("Introduce un numero impar del 3 al 25");
        int valor = teclado.nextInt();
   
            // asi da el numero impar
        if (valor > 3 && valor < 25){

            if ( valor % 2 != 0 ){
                 System.out.println("Numero impar introducido =" + valor);
                 //
                for ( int i = valor ; i > 0 ; i-=2){ // i-=2 para colocar la piramide
                    // 1. Espacios
                    for (int s = 0; s <(valor - i) / 2; s++) { // Formula para centrar ( valor - i) / 2
                    System.out.print(" "); // espacios
                    }
                    // 2. Asteriscos
                    for ( int j = i; j >0 ; j--){
                        System.out.print("*");    
                    }
                      System.out.println("");// importante // salto de linea
                }
              
            }else{
                  System.out.println("El valor es un número par");   
                  return;
            }
            
            
            
        }else{
            System.out.println("El valor está fuera del rango de 3 hasta 25");   
            return;
        }
        
    }
    
}
