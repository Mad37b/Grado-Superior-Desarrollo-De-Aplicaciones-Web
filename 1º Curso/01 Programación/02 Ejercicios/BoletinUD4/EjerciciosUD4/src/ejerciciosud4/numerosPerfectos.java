/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 30
 * @author Ulises III
 */
public class numerosPerfectos {
    
    /**
     * Imprimir numeros perfectos del 1 al n
     **/
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numeroN =teclado.nextInt();
        
        if ( numeroN <=-1){
            System.out.println(" el numero es negativo" + numeroN);   
            //continue;
        }
        int num = 0;
        for (int i = 1; i <= numeroN; i++) {
              //num = (int)Math.pow(2, i-1)*((int)Math.pow(2, i) - 1);
                 int suma =0 ;
  
           for (int j = 1; j < i; j++) {
               
             
                if(i%j==0){ // i dividendo j divisor
                    suma +=j;
              
                }
      
            }
               if( suma == i ){   
                     
                     System.out.println("el numero perfecto es " + i );   
                     
                     
                 }
   
        }   
    }
}
