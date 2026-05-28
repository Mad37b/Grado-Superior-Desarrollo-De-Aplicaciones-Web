package examen01;

import java.util.Scanner;

/**
 *
 * @author Ulises III
 */
public class Ej01b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        while (true) {
            System.out.println("Introduce un numero impar entre 10 y 1000:");
            numero = teclado.nextInt();

            if ((numero >= 10 && numero <= 1000) && numero % 2 == 1) {
                System.out.println(" el numero es correcto e impar :" + numero);
                break;
            } else {
                System.out.println(" el numero NO es correcto y es par :" + numero);
            }

        }

        for (int i = 1; suma < numero; i++) {
            suma += i;

        }
        if (suma == numero) {
            System.out.println("Es triangular:" + suma);
            suma = 0;

        }
        suma = 0;
    }
}
