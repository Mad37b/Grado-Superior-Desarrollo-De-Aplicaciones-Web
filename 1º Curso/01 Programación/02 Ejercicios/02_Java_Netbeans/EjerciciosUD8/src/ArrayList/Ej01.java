package ArrayList;
import java.util.*;

/**
 * Ejercicio 1
 *
 * @author Ulises III
 */
public class Ej01 {

    public static void main(String[] args) {

        int tabla[][] = new int[4][4];
        Integer vector[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        int numero = 0;
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(vector)); // no le vale int - Solo le vale objetos, no primitivos

        // Mezcla los numeros
        Collections.shuffle(lista); // Por cada vez que se ejecuta cambia las posiciones 

        //1. Rellenamos la tabla
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = lista.get(numero++);
            }

        }
        //2. Mostramos la tabla 
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println(" ");
            
        }

    }
}
