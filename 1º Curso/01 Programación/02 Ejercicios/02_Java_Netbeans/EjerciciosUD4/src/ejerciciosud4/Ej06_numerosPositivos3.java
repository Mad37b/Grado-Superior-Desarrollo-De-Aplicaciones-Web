package ejerciciosud4;

import java.util.Scanner;

/**
 * Apartado 6
 * @author Ulises III
 */
public class Ej06_numerosPositivos3 {
    
    public static void main (String []arg){
    
        
        Scanner teclado = new Scanner (System.in);
        
            System.out.println("Bienvenido al programa , inserte el primer numero");
        int num1=teclado.nextInt();
        System.out.println(" inserte el segundo numero");
        int num2=teclado.nextInt();
        
        /**
         * Condiciones 
         * 
         * - No se calcula la suma porque el primer número es negativo
            - No se calcula la suma porque el segundo número es negativo
                - No se calcula la suma porque los dos números son negativos    
         * 
         **/
        // Mientras los numeros 1 y 2 sean negativos 
        while ( num1 < 0 && num2 <0){
            
             if ( num1 < 0 && num2 <0){
            
            System.out.println("Los dos numeros introducidos son Negativos - " +"num1"+num1+" - "+"num2"+ num2);
            
            
          
        }else if( num1 < 0 ){
            System.out.println("El primer numero es negativo");
            
        }else if (num2 <0){
        
             System.out.println("El primer numero es negativo");
            
        }else{
            
      
            System.out.println("Perfecto , los dos numeros son Positivos,"+"num1"+num1+" - "+"num2"+ num2);
            System.out.println("Vamos a hacer la suma");
            System.out.println("num1 = "+num1+" y "+"num2 = "+num2+" = " + (num1+num2));
            
        }
            
        
            
            
            
            
        }
       
    }
    
    
}
