/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 33
 * @author Ulises III
 */
public class piramideEquilatero2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner ( System.in);
        int numero = teclado.nextInt();
        
        
        for (int i = 1; i <= numero; i++) {
            // primer triangulo izquierda
            for (int j = 1; j <= i; j++) {
                       
                    System.out.print("*");
            
                    
            }
            
            // espacios
              for (int j = 1; j <= (numero-i)*2; j++) {
                       
                    System.out.print(" "); // pulsando una vez, generamos un espacio , sin es , es una cadena vacia
                
            }
              
                 // derecha
              for (int j = 1; j <= i; j++) {
                       
                    System.out.print("*");
                
            }
            System.out.println("");
        }
        
    }
    
    
    
}
