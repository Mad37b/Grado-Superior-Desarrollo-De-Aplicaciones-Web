package examen01;

import java.util.Scanner;

/**
 * Ejercicio 2
 *
 * @author Ulises III
 */
public class Ej02b {

    public static void main(String[] args) {
        // 1. Variables     
        Scanner teclado = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Inserte el Limite Inferior");
        int limiteInferior = teclado.nextInt();
        System.out.println("Inserte el Limite Superior");
        int limiteSuperior = teclado.nextInt();

        System.out.println("sacar el divisor");

        int divisor = teclado.nextInt();

        if (divisor % 2 == 0) {

            for (int i = limiteSuperior; i > 0; i--) { // Mostramos los resultados de forma descendente
                // multiplos del divisor

                resultado = i * divisor;

                if (limiteSuperior >= resultado) {
                    //(resultado - divisor)< limiteInferior
                    if (limiteInferior > (resultado - divisor) ) {
                        System.out.print(resultado + ".");
                    } else {
                        System.out.print(resultado + ";");
                    }

                }

            }

        } else {
            System.out.println("No hay valores que cumplan las condiciones");
        }

    }

}
