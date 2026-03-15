package arrays;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 * 
 * Almacenar en un vector 5 numeros enteros leidos por teclado. Leer a continuación otro número y 
 * comprobar si está en el vector o no. En el caso de que esté visualizar que posición ocupa; sino indicarlo
   mediante un mensaje. Visualizar tambien el elemento más pequeño, el más grande y la posición de ambos. 
 */
public class Ej06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int array [] = new int [5];
        int n ;
        int mayor = array[0];
        int menor = array[0];
        int posMayor=0;
        int posMenor=0;
    
        //añadir
         for (int i = 0; i < array.length; i++) {
             array[i] = teclado.nextInt();
           
        }
         System.out.println("Introduce el valor de n ");
         n = teclado.nextInt();
        // comprobar si está o no 
        
        // ¿ Está n en el vector ? 
        
        for (int i = 0; i < array.length; i++) {
                // comprobar si n está en la posicion del vector
                if (n == array[i]) {
                    System.out.println("El numero "+ n +" esta en la posicion "+ i +" y vale: " + array[i]);
            
                }else{ System.out.println("En la posicion "+i+" El numero " + n + " no esta en el vector"); }
                
                
                // comprobar el elemento más pequeño , más grande y su posición
                
                if (array[i] > mayor) {
                mayor = array[i];
                posMayor = i ; 
            }
                
                if (array[i] > menor) {
                posMenor = i ;
            }
        }
        System.out.println("RESULTADO");
        System.out.println("El numero mayor en la posicion "+ posMayor + ", ha sido " + mayor );
        System.out.println("El numero menor en la posicion " + posMenor +", ha sido " + menor);
     
    }
}
