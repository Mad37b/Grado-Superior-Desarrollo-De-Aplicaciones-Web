/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 22
 * @author Ulises III
 */
public class Ej22_numeroPositivo5 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
          System.out.println("Numeros cuadrados  - Introduce un numero positivo");
        int numeroPositivo = teclado.nextInt();
        int contador = 0 ;
        int total = 0;
        int suma = 0 ;    
        int numeroCuadrado = 0 ; 
        
      
        
        while ( numeroPositivo >=1){ // si el numero no es positivo , vuelve a pedirlo
            
              if ( numeroPositivo <= 1){
                   System.out.println(" el numero introducido no es positivo =" + numeroPositivo);

                  }   
              
              // calculo 
              
             
              
              while (  numeroCuadrado <= numeroPositivo){
                  numeroCuadrado +=Math.pow(contador, 2);
                    contador++;
                  
                  // Resultado 
                System.out.println("Resultado numero Positivo " + numeroPositivo);
                System.out.println("Resultado de numero Cuadrado "  + numeroCuadrado);
                  
              }
              
              
                            
       }                  
    }
}
    
    
