package arrays;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 */
public class Ej19 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
         Random aleatorio = new Random();
        int numAleatorio=0 ;
        int array []= new int [100];
        
        for (int i = 0; i < array.length; i++) {
            numAleatorio = aleatorio.nextInt(200)+1;
            
            array[i] = numAleatorio;
        }
        Arrays.sort(array);
         for (int i = 0; i < array.length; i++) {
             
             System.out.println(array[i]); 
             
        }// COMPROBAR SI EL NUMERO INTRODUCIDO ES IGUAL AL QUE ESTÁ EN EL ARRAY
         numAleatorio =teclado.nextInt();
         if (teclado.nextInt()==numAleatorio) {
             System.out.println("prueba");
        }else{System.out.println("nop");}
         
         // comprobar
    }
}
