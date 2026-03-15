package bidimensionales;

import java.util.Random;

/**
 * Ejercicio 29
 *
 * @author Ulises III
 */
public class Ej29 {

    public static void main(String[] args) {

        int array[][] = new int[4][5];
        int sumaFila[] = {0, 0, 0, 0};
        int sumaColumna[] = {0, 0, 0, 0, 0};
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = aleatorio.nextInt(10) + 1;

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(j + 1 + ") " + array[i][j]);

            }
        }

        System.out.println("Calculo de la suma de los elementos de la fila");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumaFila[i] += array[i][j];

            }

        }
        System.out.println(" ");
   
        for (int j = 0; j < array[0].length; j++) { // damos así la vuelta para que sea primer columnas y luego filas en el segundo for , IMPORTANTE para encontrar las columnas
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 == 0) {
                    sumaColumna[j] += array[i][j]; 
                }
            }
        }
        int veces = 0;
        for (int suma : sumaFila) {
            System.out.println("suma de los elementos de cada fila "+veces+" --> " +suma);
            
        }
        
        System.out.println(" ");
        System.out.println("Calculo de la suma de los elementos pares de la columna");
        System.out.println(" ");
        for (int j = 0; j < sumaColumna.length; j++) {
                System.out.println("suma de los elementos pares de cada columna" + j +" --> "+ sumaColumna[j]);            
        }
    }
}