/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 
 * @author Ulises III
 */
public class sumaNumeros {
    
    
    public static void main ( String [] arg){
        
        /**
         *  Se cumple que N1 = N2 + N3
            Se cumple que N2 = N1 + N3
            Se cumple que N3 = N1 + N2
            Los números no cumplen la condición
          * 
            **/
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido al programa , inserta el numero n1");
        int n1= teclado.nextInt();
        System.out.println("inserta el numero n2");
        int n2 = teclado.nextInt();     
                System.out.println("inserta el numero n3");
        int n3 = teclado.nextInt();
           
           if (n1 == n2 + n3){
            System.out.println("Se cumplen la segunda  condicion");  
           }else if( n2 == n1 + n3){
                   
            System.out.println("Se cumplen la segunda  condicion");  
           }else if(n3 == n1 + n2){ 

           System.out.println("Se cumplen la tercera  condicion");   
          }else{
           System.out.println("Los numeros no cumplen la condicion");   
          }
           
           
           
                
    }
    
}
