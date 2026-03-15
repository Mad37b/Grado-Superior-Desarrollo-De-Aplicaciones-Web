/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 31
 * @author Ulises III
 */
public class CuadradoRectangulo {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Inserte un numero Largo");
        int largo = teclado.nextInt();
        System.out.println("Inserte un numero ancho");
        int ancho = teclado.nextInt(); 
        
        for (int i = 1; i < largo+1; i++) {
            System.out.print(" * "); // este está bien 
            for (int j = 1; j < ancho+1; j++) {
            
                  if (i== 1 || i == largo || j == ancho) { // esto hace el cuadrado
            System.out.print(" * ");
        } else {
            System.out.print("   "); // espacio para el hueco
        }
            }
               System.out.println("");   
            
            
        }
      
        
    }
    
}
