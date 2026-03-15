package ArrayList;

import java.util.*;

/**
 * Ejercicio 4: Loteria primitiva
 *
 * @author Ulises III
 */
public class Ej04 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        ArrayList<Integer> listaLoteria = new ArrayList<>();
        ArrayList<Integer> listaReintegro = new ArrayList<>();
        //Scanner teclado = new Scanner(System.in);
        Integer numero;
        int complementario = 0;
        int reintegro;

        for (int i = 0; i < 49; i++) {
            numero = aleatorio.nextInt(48);
            complementario = aleatorio.nextInt(9);
            listaLoteria.add(numero);
           
        }
        for (int i = 0; i < 9; i++) {
            reintegro = aleatorio.nextInt(9);
            listaReintegro.add(reintegro);
            
        }

        // Salida
        /**
         * Combinación 1: 4, 2, 7,23,45,34 Complementario: 13 Reintegro: 5
         * Combinación 2: ………………..*
         *
         */
         Collections.shuffle(listaLoteria);
         Collections.shuffle(listaReintegro);
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Combinación" + (i + 1) +  ":");
            for (int j = 0; j < 6; j++) {
                // Usamos i*6 para no repetir los mismos números en cada combinación
                System.out.print(listaLoteria.get(i*6+j) + " ");  
            }
            System.out.println("Complementario: " + listaLoteria.get(i)+ " Reintegro:" + listaReintegro.get(i));

        }

    }
}