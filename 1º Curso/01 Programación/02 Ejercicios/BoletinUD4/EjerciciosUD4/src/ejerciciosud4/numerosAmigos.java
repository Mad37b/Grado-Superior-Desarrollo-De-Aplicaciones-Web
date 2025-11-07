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
public class numerosAmigos {
    public static void main(String[] args) {
        //variables
        Scanner teclado = new Scanner ( System.in);
        System.out.println("Bienvenido al programa" + "\n" + " inserta el primer numero amigo");
        int numeroAmigo  = teclado.nextInt();
        System.out.println("Inserta el segundo numero amigo");
        int numeroAmigo2  = teclado.nextInt();
        int suma = 0;
        int suma2 = 0 ; 
        // numero amigo 1
        
        for (int i = 1; i < numeroAmigo; i++) {
          
                if(numeroAmigo%i == 0 ){     
                 suma += i;
                }
            }
      
        System.out.println("valor "+ suma);
        
        // numero amigo 2
        
           for (int i = 1; i < numeroAmigo2; i++) {
          
                if(numeroAmigo2%i == 0 ){     
                 suma2 += i;
                }
            }
            System.out.println("valor "+ suma2);
           // verificación
        if ( suma2 == numeroAmigo && suma == numeroAmigo2){
          System.out.println(" El numero " + numeroAmigo + " y " + " el numero " + numeroAmigo2 +" son amigos");
        
        }else{  System.out.println(" El numero " + numeroAmigo + " y " + " el numero " + numeroAmigo2 +" NO son amigos");;}
        
          
        
    }
}
