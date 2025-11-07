/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 *Apartado 5
 * @author Ulises III
 */
public class numeroPositivo2 {
    
    
    public static void main (String []arg){
    
        
        Scanner teclado = new Scanner (System.in);
        
            System.out.println("Bienvenido al programa , inserte el primer numero");
        int num1=teclado.nextInt();
        System.out.println(" inserte el segundo numero");
        int num2=teclado.nextInt();
        
        
        
      if ( num1 < 0 && num2 <0){
            
            System.out.println("Los dos numeros introducidos son Negativos - " +"num1"+num1+" - "+"num2"+ num2);
        }else{
            
            System.out.println("Perfecto , los dos numeros son Positivos,"+"num1"+num1+" - "+"num2"+ num2);
            System.out.println("Vamos a hacer la suma");
            System.out.println("num1 = "+num1+" y "+"num2 = "+num2+" = " + (num1+num2));
            
        }
        
    }
    
    
}
