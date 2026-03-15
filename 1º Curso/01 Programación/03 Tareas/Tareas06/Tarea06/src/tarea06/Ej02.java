package tarea06;

import java.util.Scanner;
import java.util.Random;

/**
 * Ejercicio 02
 *
 * @author Ulises III
 */
public class Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mapa[][] = new int[12][12];
        int nAleatorio = 0;
        int radioAnalisis; // pasos x veces
        int fila;
        int columna;
        int contador = 1;

        System.out.println("   1 2 3 4 5 6 7 8 9 10 11 12");
        System.out.println("  -------------------------------------");
        // el mapa solo se imprime una vez
        for (int i = 0; i < mapa.length; i++) {//fila
            for (int j = 0; j < mapa.length; j++) {// columna
                nAleatorio = (int) (Math.random() * 4); // entre 0 y 3
                mapa[i][j] = nAleatorio;
                if (j == 0) {
                    System.out.print(contador + "|");
                    contador++;
                }

                System.out.print(" " + mapa[i][j] + " ");

            }
            System.out.println("");//IMPORTANTE
        }
        for (;;) {

            System.out.println("Introduce el radio de analisis (-1 para finalizar):");
            radioAnalisis = teclado.nextInt();
            if (radioAnalisis == -1) {
                teclado.close();
                System.out.println("Analisis finalizado.");
                break;
            }
            System.out.println("Introduce la fila inicial:");
            fila = teclado.nextInt();
            System.out.println("Introduce la columna inicial:");
            columna = teclado.nextInt();

            // 4. Validación de datos
            if (columna < 1 || columna > 12 || fila < 1 || fila > 12) {
                System.err.println("Error en la introducción de filas o columnas , debe estar entre 1 y 12");
            } else {

                int arboles = 0;//1
                int agua = 0;//3

                // calcular limite
                int filaInicio = Math.max(0, (fila - 1) - radioAnalisis);
                int filaFin = Math.min(11, (fila - 1) + radioAnalisis);

                int colInicio = Math.max(0, (columna - 1) - radioAnalisis);
                int colFin = Math.min(11, (columna - 1) + radioAnalisis);

                // buscar las filas y compara
                for (int i = filaInicio; i <= filaFin; i++) {
                    // Revisa la fila pedida
                    // 1. Asignar cuadrante: radio , fila y columna
                    for (int j = colInicio; j <= colFin; j++) {
                        // 2.Comparar indice-valor con 1 y 3 
                        if (mapa[i][j] == 1) { // arbol // REVISAR
                            arboles++;

                        }

                        if (mapa[i][j] == 3) {//agua
                            agua++;
                        }
                    }
                }

                //salida
                System.out.println("En el area de estudio hay " + arboles + " zonas de arboles y " + agua + " zonas de agua.");

            }
        }
    }
}