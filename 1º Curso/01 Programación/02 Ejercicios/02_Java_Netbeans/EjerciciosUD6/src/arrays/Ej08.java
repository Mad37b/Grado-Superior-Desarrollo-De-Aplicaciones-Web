package arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Ulises III
 */
/**
 * Hacer un programa que simule el lanzamiento de un dado 10.000 veces. Almacenar en un vector de 6
posiciones el número de veces que salió cada tirada, escribiendo a continuación el número de veces que
salió cada cara del dado.
Calcular el tiempo que tarda en asignar al vector los 10.000 valores. Utilizar el método currentTimeMillis()
de la clase System.**/
public class Ej08 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
         int array [] = new int [6]; // contador
         //int veces = 0;
         Random aleatorio = new Random ();
         int valorAleatorio=0 ;
        
        for (int i = 0; i < 10000; i++) {
            valorAleatorio= aleatorio.nextInt(6)+1;
            array[valorAleatorio-1]++;
        }
        
        // Escribir el numero de veces que ha salido cada cara del dado
          System.out.println("Resultado");
        if( array[valorAleatorio] == 0){
            System.out.println("El numero no está en el array");
        }else if (array[valorAleatorio] > 1){
            System.out.println(" El numero " + array[valorAleatorio-1] + " se ha escrito varias veces");
        }else{
            System.out.println("el numero " + (array[valorAleatorio]-1) + " se ha escrito una vez");
    }
       long fin = System.currentTimeMillis();
       long duracion = fin - inicio ;
        System.out.println("duracion: " + duracion + " milisegundos");
    }
}