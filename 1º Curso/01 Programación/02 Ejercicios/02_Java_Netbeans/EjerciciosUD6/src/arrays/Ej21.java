package arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Ejercicio 21 : Criba de erastósteles - algoritmo/Lógica de búsqueda
 * @author Ulises III
 */
public class Ej21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        System.out.println("Escribe un numero");
        int n = teclado.nextInt();
        boolean esPrimo[]=new boolean[n+1];
        Arrays.fill(esPrimo,true );//
        if (n >= 1) esPrimo[1] = false; // El 1 no es primo
        if (n >= 0) esPrimo[0] = false; // El 0 tampoco (por si acaso)
        //buscamos primero al numero primo desde el 2
        for (int i = 2; i*i <= n; i++) {
            if (esPrimo[i]) { // Si es true es un numero primo
                    // tachamos sus múltiplos 
                  for (int j = i*i; j <= n; j+=i) {
                        esPrimo[j]=false; // tachamos sus múltiplos
                    }
            }
        }
        // Imprime por consola el resultado
        for (int i = 1; i < esPrimo.length; i++){
             System.out.println(i+") "+esPrimo[i]);
        }
    }
}