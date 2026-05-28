package Acepta;

import java.util.Scanner;

/**
 * Ej 2 : Matriculas españolas con acepta el reto 154
 *
 * @author Ulises III
 */
public class Matricula {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        char[] letrasMatricula = "BCDFGHJKLMNPQRSTVWXYZ".toCharArray();
        String aux = String.valueOf(letrasMatricula);
        while (teclado.hasNext()) {
            matricula = teclado.nextLine().trim();

            if (matricula.isEmpty()) {
                continue;
            }

            if (matricula.equals("9999 ZZZ")) {
                break; // salimos del programa
            }
            int contador = Integer.parseInt(matricula.substring(0, 4));
            String espacio = matricula.substring(4, 5);
            String letras = matricula.substring(5, 8);

            String letraIzquierda = letras.substring(0, 1);
            String letraCentro = letras.substring(1, 2);
            String letraDerecha = letras.substring(2, 3);
            char derecha = ' ';
            char centro = ' ';
            char izquierda = ' ';
            char letraD = ' ';
            char letraC = ' ';
            char letraI = ' ';
            // Compruebo las letras
            for (int i = 0; i < letrasMatricula.length; i++) {
                derecha = letrasMatricula[i]; // seleccionar letra del array
                centro = letrasMatricula[i];
                izquierda = letrasMatricula[i];
                letraD = letraDerecha.charAt(0); // mi letra // Pasamos de String a char
                letraC = letraCentro.charAt(0);
                letraI = letraIzquierda.charAt(0);

            }
            int posD = aux.indexOf(letraD);
            int posC = aux.indexOf(letraC);
            int posI = aux.indexOf(letraI);
            contador++;
            if (contador > 9999) {
                contador = 0; // El número vuelve a 0000

                if (letraD == 'Z') {
                    letraD = 'B'; // Reiniciamos la derecha

                    if (letraC == 'Z') {
                        letraC = 'B'; // Reiniciamos el centro

                        // La izquierda NUNCA será Z según las reglas del problema 
                        // (el caso 9999 ZZZ es la salida, no se procesa)
                        posI = aux.indexOf(letraI);
                        letraI = letrasMatricula[posI + 1];
                    } else {
                        // Si el centro no es Z, solo avanzamos el centro
                        posC = aux.indexOf(letraC);
                        letraC = letrasMatricula[posC + 1];
                    }
                } else {
                    // Si la derecha no es Z, solo avanzamos la derecha
                    posD = aux.indexOf(letraD);
                    letraD = letrasMatricula[posD + 1];
                }
            }
            String nuevaMatricula = String.format("%04d", contador) + " " + letraI + letraC + letraD;
            System.out.println(nuevaMatricula);

        }
    }
}
