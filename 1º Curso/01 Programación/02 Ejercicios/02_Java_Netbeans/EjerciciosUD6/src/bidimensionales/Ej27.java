package bidimensionales;

import java.util.Random;

/**
 * Ejercicio 27 
 * @author Ulises III
 */
public class Ej27 {
    
    public static void main(String[] args) {
        
        int array[][] = new int[3][7];
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = aleatorio.nextInt(20)+5;

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(j + 1 + ") " + array[i][j]);

            }
        }
        int menor = array[0][0];
        int mayor = array[0][0];

        int vecesMenor = 0;
        int vecesMayor = 0;

        int filaMenor = 0;
        int filaMayor = 0;

        int columnaMayor = 0;
        int columnaMenor = 0;
        /**
         * 92 92 aux == menor veces++ idea para ver
         *
         * *
         */
        System.out.println("Calculo del elemento más pequeño");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < menor) {
                    menor = array[i][j];

                    filaMenor = i;
                    columnaMenor = j;
                    vecesMenor = 1;

                } else if (array[i][j] == menor) {

                    vecesMenor++;

                }
            }
        }

        if (vecesMenor > 1) {
            System.out.println("menor " + menor + " aparece " + vecesMenor + " veces en \n"+"Fila: " + filaMenor + " columna: " + columnaMenor);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == menor) {
                        System.out.println("Fila: " + i + " Columna: " + j);
                    }
                }
            }
        } else {
            System.out.println("menor " + menor + " fila " + filaMenor + " columna " + columnaMenor);
        }

        System.out.println("Calculo del elemento más grande");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > mayor) {
                    mayor = array[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                    vecesMayor = 1;

                } else if (array[i][j] == mayor) {
                    vecesMayor++;
                }
            }
        }
        if (vecesMayor > 1) {
            System.out.println("Elemento mayor " + mayor + " aparece " + vecesMayor + " veces en" + "\n" + "Fila " + filaMayor + " y " + " columna " + columnaMayor);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == mayor) {
                        System.out.println("Fila: " + i + " Columna: " + j);
                    }
                }
            }
        } else {
            System.out.println("\n" + "mayor " + mayor + " fila " + filaMayor + " columna " + columnaMayor);
        }

    }
}
