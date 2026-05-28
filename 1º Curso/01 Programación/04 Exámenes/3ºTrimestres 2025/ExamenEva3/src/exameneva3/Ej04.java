package exameneva3;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Ejercicio 4
 *
 * @author dawdi : Miguel Ángel Domínguez Llorente
 */
public class Ej04 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        ArrayList<Integer> dorsales = new ArrayList<>();
        int numeros = 0;
        int contador = 0;
        // Apartado 1 
        for (int i = 0; i < 30; i++) {
            numeros = aleatorio.nextInt(99) + 1;
            contador = aleatorio.nextInt(99) + 1;

           dorsales.add(numeros);
           

        }

        // eleminar repetidos 
        if (contador < dorsales.size()) {
            dorsales.add(contador, numeros);
        }

        Collections.sort(dorsales);

        for (int numero : dorsales) {
            System.out.println(" - " + numero);
        }

        // Apartado 2 
        ArrayList<Integer> premiados = new ArrayList<>();
        System.out.println("  ");
        System.out.println("Aparado 2 :");
        
        for (int numero : dorsales) {
            
            
        }
      
        

        // añadir los multiplos de 5 o los que acaban en 7 
        // Apartado 3 
        System.out.println("  ");
        System.out.println("Apartado 3 ");
        for(int numero2 : dorsales ){
      
          if (numero2 < 20) {
              dorsales.remove(numero2);
          }
      
      }
        
      // Resultado 
        System.out.println(" ");
        System.out.println("Resultado de la eleminacion");
        for (int numero : dorsales) {
            System.out.println(numero);
        }
    }

}
