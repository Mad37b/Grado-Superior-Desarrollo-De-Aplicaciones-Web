package Bidimensional;

import java.util.Random;

/**
 * Array Bidimensionales 2
 *
 * @author Ulises III
 */
public class Bidimensionales_2 {

    public static void main(String[] args) {

        //int matriz[][] = new int[2][2];
        int[][] matriz = {
            {1, 2}, // Fila 0
            {3, 4}  // Fila 1
        };
        Random aleatorio = new Random();
        int nAleatorio;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                nAleatorio = aleatorio.nextInt(9) + 1;
                //matriz[i][j] = nAleatorio;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                
                     System.out.print(matriz[i][j] + " "); // Imprimimos la matriz
                
            }
            System.out.println(" "); // IMPORTANTE para poder imprimir la matriz como un cuadrado
        }

    }
}
