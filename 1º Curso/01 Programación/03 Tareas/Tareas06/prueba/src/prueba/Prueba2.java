package prueba;

/**
 * Ejercicio 4 examen
 *
 * @author Miguel Ángel
 */
import java.util.Scanner;

public class Prueba2 {

    public static void main(String[] args) {

        System.out.println("Introduce o escribe fin");

        Scanner teclado = new Scanner(System.in);
        String numeroStr = "";

        String cadenaFinal = "";

        int ultimoNumero = 0;
        String primerCaracter = "";
        while (true) {

            String cadena = teclado.nextLine();
            System.out.println("- ");
            for (int i = 0; i < cadena.length(); i++) {

                if (i == 0) {
                    primerCaracter = cadena.substring(0, 1);
                    System.out.println(primerCaracter);
                }
                if (i == cadena.length() - 1) {
                    ultimoNumero = Integer.parseInt(cadena.substring(i));
                    System.out.println(ultimoNumero);
                }

            }

            // Como añadir una letra por vuelta // aqui la muestra , concatenamos
            for (int i = 0; i < ultimoNumero; i++) {
                cadenaFinal += primerCaracter;
                System.out.println(cadenaFinal);
            }

            // Resultado final : Remplazar
            // bucle infinito 
            for (int i = 0; i < cadena.length(); i++) {
                // idea : donde encuentre una letra inicial , añade el resto de letras iniciales , como? ahora veremos
                //cadena += cadenaFinal;
                System.out.println("prueba");

            }

            // salida
            System.out.print("Resultado: " + cadena);
            System.out.println(" ");

            if (cadena.equalsIgnoreCase("fin")) {
                break;
            }

        }
    }
}
