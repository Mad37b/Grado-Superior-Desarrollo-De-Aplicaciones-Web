/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 36
 * @author Ulises III
 */
public class numerosAmigosRango {
    public static void main(String[] args) {
        //variables

        System.out.println("Bienvenido al programa" + "\n" + " ");
  
        System.out.println("");
        int numeroAmigo = 1;
        int numeroAmigo2  = 1;
   
        
        // numero amigo 1
        // recorre del 1 al 10.000
        for (int i = 1; i < 10000; i++) {
            
        int suma = 0;
        int suma2 = 0 ; 
        
              for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        suma += j; // acumulas solo los divisores propios
                    }
}

        // numero amigo 2
               
          
              for (int j = 1; j < i; j++) {
                    if (suma % j == 0) {
                        suma2 += j; // acumulas solo los divisores propios
                    }
}

        if ( suma2 == i && i != suma){
          System.out.println(" El numero " + i + " y " + " el numero " + suma +" son amigos");
        
        }else{  }
                
            }       
        }
        
}  


        
        
        
        
   

