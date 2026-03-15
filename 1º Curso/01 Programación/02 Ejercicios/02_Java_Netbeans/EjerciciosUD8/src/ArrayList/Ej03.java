package ArrayList;

import java.util.*;

/**
 * Ejercicio 03
 *
 * @author Ulises III
 */
public class Ej03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        Integer numeros = 0;
        int posicion = 0;
        System.out.println("Introduce los valores");

        for (int i = 0; i <= 5; i++) {
            numeros = teclado.nextInt();
            lista.add(numeros);
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println(lista.get(i)+ " ");
        }
        // 2. Una vez rellenado y mostrado los datos del ArrayList
        // pide otro numero y otra posicion
        System.out.println("Inserte de nuevo un numero");
        numeros = teclado.nextInt();
        System.out.println("Inserte una posición");
        posicion = teclado.nextInt();
        
        if (posicion < lista.size()) {
            lista.add(posicion,numeros);
        }else{
            System.out.println("posicion fuera de rango del arrayList");
        }
        System.out.println("Resultado");
        System.out.println(numeros);
    }
}