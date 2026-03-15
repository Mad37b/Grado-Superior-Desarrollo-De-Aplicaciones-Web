package bidimensionales;

/**
 *
 * @author Ulises III
 */
public class Ej32 {

    public static void main(String[] args) {
        int[][] matriz = {{3, 1, 5}, {4, 7, 2}, {9, 8, 6}};

        int valorSilla = 0;
        int fila = 0;
        int columna=0;
        boolean esSilla = true;
        int min;

        for (int i = 0; i < matriz.length; i++) {
            min = matriz[i][0]; // cada fila
            columna = 0;
            for (int j = 0; j < matriz[i].length; j++) {

                if (min < matriz[i][j]) {
                    valorSilla = min;
                    fila = i;
                    columna = j;
                   

                } 
            }
            esSilla = true;
            for (int k = 0; k < matriz.length; k++) {

                if (matriz[k][columna] > min) {
                    esSilla = false;
                    
                }

            }

        }
        if (esSilla) {

            System.out.println("Punto de silla - " + valorSilla + " fila " + fila + " columna " + columna);
        } else {
            System.out.println(" No se encuentra en punto de silla");
        }

    }
}
