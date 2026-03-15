package bidimensionales;

import java.util.Scanner;

/**
 * Ejercicio 30
 *
 * @author Ulises III
 */
public class Ej30b {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int f = in.nextInt();
        int c = in.nextInt();
        boolean enBlanco = true; //Indica el color en el que empieza la fila
        boolean blanco = enBlanco; //Toma los valores true or false

        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (blanco) {
                    matriz[i][j] = 0;
                    blanco = !blanco;
                } else {
                    matriz[i][j] = 1;
                    blanco = !blanco;
                }
            }
            enBlanco = !enBlanco;
            blanco = enBlanco;
        }
        // ESCRIBIMOS LA MATRIZ
        mostrar(matriz);
    }

    public static void mostrar(int[][] matriz) {
        int F = matriz.length;
        int C = matriz[0].length;
        for (int i = 0; i < C; i++) {
            System.out.print("-----");
        }
        System.out.println("");
        for (int i = 0; i < F; i++) {
            System.out.print("|");
            System.out.print(" ");
            for (int j = 0; j < C; j++) {

                if (matriz[i][j] < 10) {
                    System.out.print(matriz[i][j]);
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[i][j]);
                    System.out.print(" ");
                }
                System.out.print("|");
                if (j != C - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < C; i++) {
            System.out.print("-----");
        }
        System.out.println("");
    }

}
