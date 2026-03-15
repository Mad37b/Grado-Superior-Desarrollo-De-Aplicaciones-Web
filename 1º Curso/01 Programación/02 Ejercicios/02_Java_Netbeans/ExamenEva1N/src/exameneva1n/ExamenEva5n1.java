/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameneva1n;
import java.util.Scanner;

public class ExamenEva5n1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String frase;

        while (true) {
            System.out.print("Introduce una cadena formada por parejas de digito + caracter (o 'fin' para salir): ");
            frase = reader.nextLine();
            if (frase.equalsIgnoreCase("fin")) {//para ver si es fin, que se corte el programa, con esto se busca esta cadena de texto literalmente
                System.out.println("Programa terminado.");
                break;
            }
            int longitud = frase.length();//saber cuantos caracteres mide la cadena
            for (int i = 0; i < longitud; i +=2) {//bucle que recorre lo que mide, tiene que ir de 2 en 2 para poder hacer digito + letra
                char numeroChar = frase.charAt(i);//posicion del numero
                char letra = frase.charAt(i + 1);//posicion de la letra

                int numero = Character.getNumericValue(numeroChar);//convertirlo a numero para saber cuantas veces

                for (int j = 0; j < numero; j++) {//bucle para saber cuantas veces se imprime
                    System.out.print(letra);//imprimimos la letras x veces gracias al bucle
                }
            }
            System.out.println(); // salto de línea al final
        }
    }
}