package arrays;
import java.util.Arrays;
import java.util.Random;

/**
 * Ejercicio 20
 * @author Ulises III
 */
public class Ej20 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int array []= new int [3000];
        int numAleatorio ;
        
         for (int i = 0; i < array.length; i++) {
            numAleatorio = aleatorio.nextInt(2000)+1;
            
            array[i] = numAleatorio;
        }
          Arrays.sort(array);
              // Dato curioso para mostrar 
          System.out.println("El número más pequeño es: " + array[0]);
            System.out.println("El número más grande es: " + array[array.length - 1]);
            // Esto imprime el array entero de una vez entre corchetes
            //System.out.println(Arrays.toString(array));
    }

    
   
}
