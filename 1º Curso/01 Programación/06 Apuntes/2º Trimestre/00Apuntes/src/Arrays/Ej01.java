package Arrays;

import java.util.Scanner;

/**
 * Ejercicio 1 - Crea un array que almacene 10 numeros leidos por teclados,
 * luego tiene que decir cual es el numero que mas veces sale y cuantas veces
 * sale
 *
 * @author Ulises III
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numerosAlmacenados[] = new int[10];
        int contadorArray[] = new int[10];
        int valor = 0;
        int veces = 0;
        int numeroLeido;
        int indice = 0;
        boolean esRepetido = false;
        // 1. rellenar
        for (int i = 0; i < numerosAlmacenados.length; i++) {

            numeroLeido = teclado.nextInt();
            numerosAlmacenados[i] = numeroLeido;

        }
        // 2. Imprimir
        for (int i = 0; i < numerosAlmacenados.length; i++) {

            System.out.print(numerosAlmacenados[i] + " - ");

        }
        // 3. Aver
        for (int i = 0; i < numerosAlmacenados.length; i++) {
            indice = i;

            if (indice == numerosAlmacenados[i]) {
                //valor = indice;
                contadorArray[i] = valor;

            }

            if (contadorArray[i] == numerosAlmacenados[i]) {
                esRepetido = true;
                valor = contadorArray[i];
            }

        }
        System.out.println("El numero que más se repite es " + valor + " y las veces que se repite es " + veces);
    }
}
