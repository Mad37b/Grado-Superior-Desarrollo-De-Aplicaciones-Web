
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ulises III
 */
public class numerosAleatorios {
    
    
    public static void main(String []arg){
        
     int lista [] = new int [5];   
     
     int numero = 0 ; 
     
     Random numeroAleatorio = new Random();
     
   
        for (int i = 0 ; i< lista.length; i ++){
            numero = numeroAleatorio.nextInt(100); 
            lista[i] = numero;
            
          
            System.out.println("Consulta Numeros Aleatorios = " + i + " - " + lista[i]);

                  for ( int j = 0 ; j < lista.length; j++){
            
                    int valor = lista[j];
            
 
        }
            
            
       }
    
        // Para ordenar los numeros de un array , tendremos que colocar los valores de los indices de menor a mayor 
        
        
  
        
        
    }
}