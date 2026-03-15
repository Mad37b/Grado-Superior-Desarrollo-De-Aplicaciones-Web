package Arrays;

import java.util.Scanner;

/**
 * Unidimensionales
 *
 * @author Ulises III
 */
public class Estadisticas {

    public static void main(String[] args) {
        double array[] = new double[5];
        Scanner teclado = new Scanner(System.in);
        double notas = 0;
        double media = 0;
        double max = 0;
        double min = 0;

        for (int i = 0; i < array.length; i++) {

            notas = teclado.nextDouble();
            array[i] = notas;
        }

        max = array[0];
        for (int j = 0; j < array.length; j++) {

            if (max < array[j]) {
                max = array[j];
            }
        }
        min = array[0];
        for (int j = 0; j < array.length; j++) {

            if (min > array[j]) {
                min = array[j];
            }

        }

        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];

        }

        media = suma / array.length;

        System.out.println("Salida:");
        System.out.println("nota máxima :" + max);
        System.out.println("nota minimo :" + min);
        System.out.println("nota media :" + media);
        int contador =0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] >=5) {
                contador ++;
            }
        }
        
        System.out.println("notas iguales o mayores a 5: " + contador);
        
    }
}
