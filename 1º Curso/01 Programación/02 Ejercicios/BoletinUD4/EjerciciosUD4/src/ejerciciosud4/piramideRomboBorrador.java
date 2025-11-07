/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 34 Borrador
 * @author Ulises III
 */
public class piramideRomboBorrador {
    
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa , inserte el numero");
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        
        if ( numero %2 == 1 && numero >= 3 || numero <=15 ){
            
            System.out.println(" * ");
            for (int i = 0; i < numero; i++) { 
                
                System.out.println("*");
                for (int j = 0; j < numero; j++) { // columna
                  
                }
                
                for (int s = 0; s < 1; s++) { // puntos
                    System.out.print(" . ");
                }
                
                
            }
            System.out.print("  ");
            
     
        }
        
        
        
    }
    
    
    
}
