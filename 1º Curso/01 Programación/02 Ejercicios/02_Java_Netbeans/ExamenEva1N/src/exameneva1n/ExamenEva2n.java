/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameneva1n;
import java.util.Scanner;
/**
 * 2 : Numeros narcicistas
 * @author Ulises III
 */
public class ExamenEva2n {
    
    
    public static void main (String [] arg){
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un valor ");
        String valor = teclado.nextLine();
        int total = 0;
         int numeroNarcicista = 0;
         int numero = 0;
        
        for (int i = 0; i < valor.length(); i++){
            
            numero = valor.charAt(i)-'0'; // separa los caracteres 
         
            valor.length(); // cuenta las lineas de los caracteres 
            System.out.println(" los numeros han sido " + valor.charAt(i));
            System.out.println("Depuro numero " + numero);
            
            System.out.println("Numero narcicista  = > " + valor  + " -> "+valor.charAt(i)+" ^ "+valor.length());
            
            // Ahora vamos a calcular si el numero es narcicista
            
            System.out.println("<-------------------------------------------->");

            
            
        numeroNarcicista = (int)Math.pow(numero,valor.length()); // quiero añadir cada vez una nueva suma segun el char
        
        
        total += numeroNarcicista;
       
            System.out.println(" Prueba total - " + total);
        
            System.out.println("Resultados de numeros narcicista");
            System.out.println(numeroNarcicista);
          
                      
            
            // saber 
        }
        System.out.println(" ver el valor definitivo de narcicista -->" + numeroNarcicista);
        System.out.println(" ver el numero total " + total);
        System.out.println(" Comprobamos si el numero es narcicista");
                    
                    
          int nuevoValor = Integer.parseInt(valor);
          
          if ( nuevoValor == total){
              System.out.println(" Si, el numero" + nuevoValor+ " es narcicista");
          }else{
                    System.out.println("No , el numero " + nuevoValor + " no es narcicista");
          }     
        //System.out.println("Depuracion definitiva de numero al final "+numero);
        
        
        
        
    }
    
}
