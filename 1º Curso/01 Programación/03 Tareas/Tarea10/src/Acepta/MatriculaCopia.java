package Acepta;

import java.util.Scanner;

/**
 * Ej 2 : Matriculas españolas con acepta el reto 154
 *
 * @author Ulises III
 */
public class MatriculaCopia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        char[] letrasMatricula = "BCDFGHJKLMNPQRSTVWXYZ".toCharArray();
        // contador de 1 al 9999
        // contador de A a Z
        while (true) {
            matricula = teclado.nextLine();

            if (matricula.equals("9999 ZZZ")) {

                break; // salimos del programa
            }
            int contador = Integer.parseInt(matricula.substring(0, 4));
            String espacio = matricula.substring(4, 5);
            String letras = matricula.substring(5, 8);

            //System.out.println("contador numeros:" + contador);
            //System.out.println("contador espacio:" + espacio);
            //System.out.println("contador letras:" + letras);
            //System.out.println("");
            // aqui cuidado
            System.out.println(" ");
            //System.out.println("Prueba letras");
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

            //System.out.println(letraI);
            //System.out.println(letraC);
            //System.out.println(letraD);
            if (contador == 9999) {
                
                // contador letra +1

                // Contar letras con condiciones
                if (letraD == 'Z' && letraC == 'Z') {
                    contador = 0000;
                    letraD = 'B';
                    letraC = 'B';
                    letraI++;

                } else if (letraD == 'Z') {
                    contador = 0000;
                    letraD = 'B';
                    letraC++;

                } else if (letraC == 'Z') {
                    contador = 0000;
                    letraC = 'B';
                    letraI++;
                } else if (letraI == 'Z') { // A LO MEJOR ME SOBRA
                    //letraI++;
                }
            } else {
                contador++;
            }

            // Salida
            //String.valueOf(contador);
            String nuevaMatricula = String.format("%04d", contador) + " " + letraI + letraC + letraD;
            System.out.println(nuevaMatricula);

        }

    }
}
