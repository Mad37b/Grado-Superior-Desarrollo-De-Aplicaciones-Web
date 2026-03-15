package tarea06;
import java.util.Scanner;
/**
 * Ejercicio 4 : acepta el reto 207 - camping
 *
 * @author Ulises III
 */
public class Ej04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int casos; // camping 
        int filas = 0;
        int columnas = 0;
        int array[][];
        int nArboles = 0;
        int zonaSombra = 0;
        while (true) {
            filas = teclado.nextInt();
            columnas = teclado.nextInt();
            nArboles = teclado.nextInt();
            array = new int[filas][columnas];
            if (columnas == 0 && filas == 0 && nArboles == 0) {
                break;
            } else {
                // marcamos los limites
                int filaInicio;
                int filaFin;
                int columnaInicio;
                int columnaFin;

                int fArbol;
                int cArbol;
                // pongo los arboles 

                for (int i = 0; i < nArboles; i++) {
                    fArbol = teclado.nextInt();
                    cArbol = teclado.nextInt();
                    array[fArbol-1][cArbol - 1] = 1;

                }
                // pongo las sombras 
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        // si encuentra un arbol , pondrá sombra
                        if (array[i][j] == 1) {

                            filaInicio = Math.max(0, i - 1);
                            filaFin = Math.min(filas - 1, i + 1);
                            columnaInicio = Math.max(0, j - 1);
                            columnaFin = Math.min(columnas - 1, j + 1);

                            for (int f = filaInicio; f <= filaFin; f++) {
                                for (int c = columnaInicio; c <= columnaFin; c++) {
                                    if (array[f][c] == 0) {
                                        array[f][c] = 2;
                                    }
                                }
                            }
                        }
                    }
                }
                // contamos las sombras
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (array[i][j] == 2) {
                            zonaSombra++;
                        }
                    }
                }

                System.out.println(zonaSombra);
                zonaSombra=0;
            }

        }
    }
}
