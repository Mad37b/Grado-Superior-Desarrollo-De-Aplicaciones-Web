package Pilas;

import java.util.*;

/**
 * Ejercicio 10 :tortitas  - Sin validar
 *
 * @author Ulises III
 */
public class Ej10b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanoTortitas;
        int vueltas = 0;
        while (teclado.hasNext()) {
            // Dime cuantas tortitas quieres 
            tamanoTortitas = teclado.nextInt();
            ArrayList<Integer> lista = new ArrayList<>();// Bandeja de las tortitas
            Stack<Integer> pila = new Stack<>();
            if (tamanoTortitas == -1) {
                break;
            }

            while (tamanoTortitas != -1) {
                pila.push(tamanoTortitas);
                tamanoTortitas = teclado.nextInt(); // Pedimos hasta que le demos -1 para pararlo
            }

            // 2. Vueltas a las tortitas
            vueltas = teclado.nextInt();

            for (int i = 0; i < vueltas; i++) {
                int giro = teclado.nextInt();

                lista.clear();

                for (int j = 0; j < giro; j++) {
                    lista.add(pila.pop());
                }
                for (int tortita : lista) {
                    pila.push(tortita);
                }

            }

            // SALIDA
            // SALIDA: peek() nos dice cuál está arriba sin quitarla
            if (!pila.isEmpty()) {
                System.out.print(pila.peek());
            }
        }

    }
}
