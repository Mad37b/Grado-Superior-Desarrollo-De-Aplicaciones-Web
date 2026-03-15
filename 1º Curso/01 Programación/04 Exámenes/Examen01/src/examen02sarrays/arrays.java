package examen02sarrays;

import java.util.Random;

/**
 *
 * @author Ulises III
 */
public class arrays {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int nAleatorio;
        int tablero[][] = new int[3][3];
        int suma = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                nAleatorio = aleatorio.nextInt(10)+ 1;
                tablero[i][j] = nAleatorio;
            }

        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print( tablero[i][j]+" ");
               
            }
            System.out.println(" ");
        }
        // calculo de la diagonal: suma los numeros que hay en diagonal , tambien podemos hacerlo comparando i==j con if 
        
        for (int i = 0; i < tablero.length; i++) {
            suma +=tablero[i][i];
        }
        
        System.out.println("La suma de la diagonal principal  es: "+suma);
    }
}