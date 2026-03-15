package examen01;
import java.util.Scanner;
/**
 * Ejercicio 2
 *
 * @author Ulises III
 */



public class Ej02 {

    public static void main(String[] args) {

        // 1. Variables     
        Scanner teclado = new Scanner(System.in);
        int resultado = 0;

        //2. 
        System.out.println(" Bienvenido al programa !" + "\n " + "Inserte el primer Limite Inferior");
        int limiteInferior = teclado.nextInt();
        System.out.println("Inserte el primer Limite Superior");
        int limiteSuperior = teclado.nextInt();

        System.out.println("Ahora vamos a sacar el divisor");

        int divisor = teclado.nextInt();

        // tienen que ser numeros pares
        // que sean multiplo del divisor 
        // falta que el punto solo se añada al final 
        // 
        if (divisor % 2 == 0) {

            for (int i = limiteSuperior; i > limiteInferior; i--) { // Mostramos los resultados de forma descendente

                resultado = divisor * i;

                System.out.print(resultado + ";");

                if (resultado <= limiteInferior) {
                    // el ultimo valor debe acabar en . 
                    System.out.print(resultado + ".");
                }

            }

        } else {
            System.out.println("No hay valores que cumplan las condiciones");
        }

        //2. Calculo 
        // vamos a hacer una operacion de multiplos 
    }

}
