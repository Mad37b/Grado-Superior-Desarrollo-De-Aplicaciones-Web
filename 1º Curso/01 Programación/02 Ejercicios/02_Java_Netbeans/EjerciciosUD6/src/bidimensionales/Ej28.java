package bidimensionales;

import java.util.Random;

/**
 * Ejercicio 28
 *
 * @author Ulises III
 */
public class Ej28 {

    public static void main(String[] args) {

        int array[][] = new int[4][5];
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

        int sumaFilas = 0;
        int sumaColumnaPares = 0;
        int veces = 1;

        System.out.println("Calculo de la suma de los elementos de la fila");
        for (int i = 0; i < array.length; i++) {
            sumaFilas = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumaFilas += array[i][j];
                
            }
            System.out.println("suma de los elementos de la fila " + i + " -->" + sumaFilas);
        }
        System.out.println(" ");
        System.out.println("Calculo de la suma de los elementos pares de la columna");
        for (int j = 0; j < array[0].length; j++) { // damos así la vuelta para que sea primer columnas y luego filas en el segundo for , IMPORTANTE para encontrar las columnas
            sumaColumnaPares = 0;// recordar reiniciar los acomuladores o las sumas por cada vuelta completada
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 == 0) {
                    sumaColumnaPares += array[i][j];

                }
            }
             System.out.println("suma de los elementos pares de la columna " + j + " --> " + sumaColumnaPares); // aqui no repite líneas de salida
        }

    }
}
