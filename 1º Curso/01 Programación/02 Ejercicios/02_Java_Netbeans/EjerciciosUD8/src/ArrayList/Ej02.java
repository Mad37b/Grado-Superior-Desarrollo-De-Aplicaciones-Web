package ArrayList;

import java.util.*;

/**
 * Ejercicio 2
 *
 * @author Ulises III
 */
public class Ej02 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int nAleatorio;
        int mayor = 0, menor = 0;
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            nAleatorio = aleatorio.nextInt(41) + 20;
            numeros.add(nAleatorio);
        }
        for (Integer numero : numeros) {

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }
        // Salida
        System.out.println(numeros + " ");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

}
