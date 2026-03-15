package Conjunto;

import java.util.*;

/**
 *
 * @author Ulises III
 */
public class Ej08 {

    public static void main(String[] args) {

        TreeSet<Integer> limpio = new TreeSet<>();
        Random aleatorio = new Random();

        while (limpio.size() < 40) {
            limpio.add(aleatorio.nextInt(60) + 1);
        }
        ArrayList<Integer> lista = new ArrayList<>(limpio); // Pasar de SET a LIST

        System.out.println("ASCENDENTE" + "\n");

        for (int numero : lista) {
            System.out.print(numero + " ");
        }

        System.out.println("\n" + "DESCENDENTE");
        Collections.sort(lista, Collections.reverseOrder()); // DESCENDENTE 
        for (int numero : lista) {
            System.out.print(numero + " ");
        }

    }
}