package Bidimensional;

import java.util.Random;

/**
 * Arrays Bidimensionales: pasos básicos
 *
 * @author Ulises III
 */
public class Bidimensional {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Random aleatorio = new Random();
        int nAleatorio;
        int sumaDiagonal = 0;
        int sumaLineal = 0;
        int sumaColumna = 0;

        // Rellenamos la matriz de numeros aleatorios del 1 al 9 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                nAleatorio = aleatorio.nextInt(9) + 1;
                matriz[i][j] = nAleatorio;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " "); // Imprimimos la matriz
            }
            System.out.println(" "); // IMPORTANTE para poder imprimir la matriz como un cuadrado
        }

        // suma de Columnas
        System.out.println("suma por cada Columna");
        for (int i = 0; i < matriz.length; i++) {
            sumaColumna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaColumna += matriz[j][i]; // Pasamos de matriz[i][j] a matriz[j][i] para girar la matriz y que sume las columnas

            }
            System.out.println("Columna " + i + ")" + sumaColumna);
        }

        // Girar la matriz 
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");

            }
            System.out.println(" ");
        }

        // suma en diagonal y lineal 
        System.out.println("suma por cada fila ");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j]; // suma fila por fila 
                sumaLineal += matriz[i][j]; // sumaTotalFilas de todas las filas de la matriz

            }
            sumaDiagonal += matriz[i][i]; // suma Diagonales 
            System.out.println("Fila " + i + ")" + sumaFila);
        }

        //Salida
        System.out.println("suma diagonal :" + sumaDiagonal);
        System.out.println("suma todas las filas (lineal) :" + sumaLineal);

    }

}
