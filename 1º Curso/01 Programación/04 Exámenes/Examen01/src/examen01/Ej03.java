package examen01;

/**
 * Ejercicio 03
 *
 * @author Miguel Ángel
 */

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al ejercicio 3 - triangulo invertido hueco");
        int numero = teclado.nextInt();

        for (int i = numero; numero % 2 == 1; i++) { // bucle como while pero con for 
            System.out.println("he creado un bucle si el numero es impar" + numero);

            // si el valor es impar i = impar
            for (int j = numero; j > 0; j -= 2) { // PIRAMIME // tamaño 

                for (int k = 0; k < (numero - j) / 2; k++) { // espacios 
                    System.out.print(" ");
                }

                for (int s = j; s > 0; s--) { // dibujar

                    System.out.print("*");

                    // aqui defino el centro 
                }
                System.out.println(""); // salto de linea 

            }
            if (numero % 2 == 0) {
                System.out.println("Este numero es par , introduce un valor Impar");
                numero = teclado.nextInt();
            }
            System.out.println("Perfecto Ahora introduce otro valor impar");
            numero = teclado.nextInt();
        }// bucle principal que pide que el numero sea impar
        if (numero % 2 == 0) {
            System.out.println("Este numero es par , introduce un valor Impar");
            numero = teclado.nextInt();
        }
    }
}
