/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 *Apartado 9
 * @author Ulises III
 */
public class Ej09_valoresDescuento {
    /**9. Diseñar un programa que calcule el importe final de una venta considerando que sobre el valor bruto se
          hace un descuento según la siguiente tabla:
            Valores <=200 No se aplica descuento
            Valores >200 y <=1000 Descuento 5%
            Valores >1000 Descuento 10%**/
    
    public static void main (String [] arg){
    Scanner teclado = new Scanner (System.in);
    int valores =teclado.nextInt();
   double descuento = 0 ;
   double total = 0;
    
    if( valores <=200){
        
        System.out.println("no se le aplica  descuento");
    
    
    } else if (valores > 200 && valores <=1000){
            System.out.println("se le aplica un 5% de descuento");
            descuento = valores *(0.05);
              System.out.println("valor descuento = " + descuento);
               total = valores -descuento;
               System.out.println(" valor total =" + total);
}else if (valores > 1000){   
        System.out.println("se le aplica un 10% de descuento");
        descuento = valores *(0.10);
        System.out.println("valor descuento = " + descuento);
          total =  valores - descuento ;
        System.out.println(" valor total =" + total);
    }
    }
    
}
