package bidimensionales;

import java.util.Random;

/**
 * Ej 33
 *
 * @author Ulises III
 */
public class Ej33 {
// Regla de punto de silla , el más pequeño de la fila pero el más grande de la columna

    public static void main(String[] args) {
        int array[][] = new int[8][10];

        Random aleatorio = new Random();
        int nAleatorio;
        int valorSilla = 0;
        int fila = 0;
        int columna = 0;
        boolean esSilla = true;
        boolean esEncontrado = false;
        int min;

        while (!esEncontrado) {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    nAleatorio = aleatorio.nextInt(50) + 1;
                    array[i][j] = nAleatorio;
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("");
            }

            // buscamos la silla
            for (int i = 0; i < array.length; i++) {
                min = array[i][0]; // cada fila
                columna = 0;
                for (int j = 0; j < array[i].length; j++) {

                    if (min > array[i][j]) {  // busca el máximo de la fila
                        min = array[i][j];
                        valorSilla = min;
                        fila = i;
                        columna = j;

                    }
                }
                esSilla = true;

                for (int k = 0; k < array.length; k++) {

                    if (array[k][columna] > min) {
                        esSilla = false;
                        break;
                    }

                }

                // salida
                if (esSilla) {
                    esEncontrado = true;
                    fila = i;
                    valorSilla = min;
                    System.out.println("Salida: ");
                    System.out.println("\n " + "Punto de silla - " + valorSilla + " fila " + fila + " columna " + columna);
                } else {
                    System.out.println("Salida: ");
                    System.out.println(" No se encuentra en punto de silla");
                }

            }

        }
    }
}
