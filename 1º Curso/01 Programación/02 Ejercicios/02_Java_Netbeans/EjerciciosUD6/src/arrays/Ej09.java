package arrays;
import java.util.Scanner;
import java.util.Random;
/**
 * @author Ulises III
 */
/**
 * Hacer un programa que almacene en un vector de 100 elementos números generados al azar
comprendidos entre 20 y 50. Escribir los números generados, visualizando 20 números por línea. Escribir a
continuación cuántos números fueron generados entre 21 y 30. La salida tiene que tener el formato:**/

public class Ej09 {
    public static void main(String[] args) {
        int array [] = new int [100];
        int veces;
        Random aleatorio = new Random();
        int nAleatorio ;
        int numero=0 ;
        for (int i = 0; i < array.length; i++) {
            nAleatorio = aleatorio.nextInt(50-20+1)+20; // .nextInt ( max-min+1)+20
            array[i] = nAleatorio;
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println("prueba " + array[i]);
        }
        
        System.out.println("----------------------");
        System.out.println("Numeros generados entre el 21 hasta el 30");
        
        for (numero= 21; numero  <= 30; numero++) { // no caí en esto - buscar / consultar valores concretos de un valorA a valorB determinados
            veces =0;
            
             for (int i = 0; i < array.length; i++) {
                if (array[i]==numero) {
                    veces++;
                }
        }
       System.out.println("El numero " + numero + " aparecio " + veces + " veces");
        }
    }
}