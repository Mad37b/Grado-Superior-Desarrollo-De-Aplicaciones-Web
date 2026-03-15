package bidimensionales;

import java.util.*;

/**
 *
 * @author Ulises III
 */
/**
 * Un Cuadrado Latino de orden $n$ es una matriz de $n \times n$ donde cada
 * elemento aparece exactamente una vez en cada fila y una vez en cada columna.
 *
 *
 */
public class Ej31 {

    public static void main(String[] args) {
        int n = 10;
        int contador;
        int[][] cuadrado = new int[n][n];

        // meto numero y desplazo
        for (int i = 0; i < cuadrado.length; i++) {
            if (i == 0) {
                contador = 1;      // La primera fila empieza siempre en 1
            } else {
                contador = 11 - i; // A partir de la segunda, retrocedemos para desplazar a la derecha
                //contador = (n + 1) - i; // alternativa 
            }
            for (int j = 0; j < cuadrado[i].length; j++) {
                cuadrado[i][j] = contador;
                contador++;
                if (contador > 10) {
                    contador = 1;
                }

                // si el valor de la primera fila es 10 , lo paso a la segunda fila y vuelvo a contar
                // si el valor de la segunda fila es 9 , lo paso a la tercera fila y vuelvo a contar y así consecutivamente 
            }

        }

        // Imprimo el array
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
