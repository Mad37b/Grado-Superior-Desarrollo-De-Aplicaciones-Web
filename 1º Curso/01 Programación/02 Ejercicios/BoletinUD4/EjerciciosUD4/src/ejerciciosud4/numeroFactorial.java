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
public class numeroFactorial {
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int numeroFactorial= 1;
        int numero= teclado.nextInt();
        
        for (int i = 1; i <= numero; i++) {
       
        numeroFactorial = numeroFactorial * i; // cuidado como interpretamos las multiss o las operaciones segun las variables y indices 
    }
        System.out.println("el numero factorial de " + numero + "! es " + numeroFactorial);
    }
    
}
