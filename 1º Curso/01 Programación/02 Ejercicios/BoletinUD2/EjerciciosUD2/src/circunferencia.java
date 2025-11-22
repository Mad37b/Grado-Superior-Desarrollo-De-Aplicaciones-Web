/**
 *
 * @author Ulises III
 */

import java.util.Scanner;

public class circunferencia {
    
    public static void main (String [] arg){
        
        Scanner teclado = new Scanner ( System.in);
      
        
       // Math.sqrt( ) Sirve para raiz cuadrada
        // Math.pow ( variable , poner numero a elevar ) eleva los numeros según su elevado  / indice se dice ? mm
        
        
        System.out.println("Bienvenido al programa de la circunferencia , introduza un valor real");   
          String valor = teclado.nextLine();
          
           double radio = Double.parseDouble(valor);
           
           
           double superficie = Math.PI * Math.pow(radio,2);
           double longitud = 2 * Math.PI * radio ; 
           
           
           System.out.println("Los valores del la circunferencia a sido " );
           System.out.println("Superficie del circulo = " + superficie );
           System.out.println("Logintud de la circunferencia " + longitud );
      
           
           
           
        
    }
    
    
    
}
