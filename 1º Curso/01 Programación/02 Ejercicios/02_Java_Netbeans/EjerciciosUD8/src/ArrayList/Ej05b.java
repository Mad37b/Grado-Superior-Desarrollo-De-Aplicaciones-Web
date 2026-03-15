package ArrayList;

import java.util.*;

/**
 * Ejercicio 5: Metodo automático
 *
 * @author Ulises III
 */
public class Ej05b {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random aleatorio = new Random();
        boolean[] esVisto = new boolean[60];
        int numero = 0;

        // 1. Rellenamos 
        for (int i = 0; i <= 40; i++) {
            lista.add(aleatorio.nextInt(60));
        }

        // 2. Limpiamos // filtrar repetidos 
        for (int i = 0; i < lista.size(); i++) {
            numero = lista.get(i);
            if (esVisto[numero]) {
                lista.remove(i); // borramos el numero visto
                i--; // retrocedemos
            } else {
                esVisto[numero] = true;
            }
        }

        // 3. mostrar de forma ascendente y descendente
        Collections.shuffle(lista);

        System.out.println("ASCENDENTE:");
        for (int i = 0; i <= lista.size() - 1; i++) {

            if (i < lista.size() - 1) {
                System.out.print(lista.get(i)+", ");
            } else {
                System.out.println(lista.get(i) + ".");
            }

        }

        System.out.println(" ");
        System.out.println("DESCENDENTE:");
        for (int i = lista.size() - 1; i >= 0; i--) {
              if (i > 0 ) {
                System.out.print(lista.get(i)+", ");
            } else {
                System.out.print(lista.get(i) + " .");
            }

        }
        
    }
}
