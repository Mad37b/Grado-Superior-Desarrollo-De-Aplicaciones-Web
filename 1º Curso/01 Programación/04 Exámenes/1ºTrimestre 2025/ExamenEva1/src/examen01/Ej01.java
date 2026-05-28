package examen01;

import java.util.Scanner;

/**
 *
 * @author Ulises III
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Restricciones: A) Pedir un número por teclado, obligando al usuario a
         * que introduzca un valor impar comprendido entre 10 y 1000 B) Que sea
         * 10 a 10000
         *
         */
        //1 . Variables 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al ejercicio 1, introduce un valor del 10 al 10000");
        int numero = teclado.nextInt();

        //A 
        while (numero >= 10 && numero <= 1000 && numero % 2 == 1) {
            //Primera comprobación
            if (numero >= 10 && numero <= 100) {

                System.out.println(" Perfecto, el numero " + numero + " es triangular");
                break;
            } else {

                System.out.println("número incorrecto, tiene que ser comprendido entre 10 y 1000" + "\n" + "Vuelve a intentarlo");
                numero = teclado.nextInt();
            }

            // Segunda comprobación 
            if (numero % 2 == 0) {
                System.out.println("número incorrecto, tiene que ser impar " + "\n" + "Vuelve a intentarlo");
                numero = teclado.nextInt();
            }
        }// acabo bucle 
    }
}
