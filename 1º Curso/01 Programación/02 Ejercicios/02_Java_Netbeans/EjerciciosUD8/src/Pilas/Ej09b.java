package Pilas;
import java.util.*;
/**
 * Ejercicio 9
 * @author Ulises III
 */
public class Ej09b {
    public static void main(String[] args) {
        
        Stack<Character> pila = new Stack <>();
        Stack<Character> pilaReversa = new Stack <>();
        String letras ="Holaquetalestas";

        //1. Añade 
        
        for (int i = 0; i <letras.length(); i++) {
            pila.add(letras.charAt(i));
        }
        // 2. Ascendente con pop
        System.out.println("Aumenta");
        
        System.out.println(pila);
        //3. Descendiente con push y pop ?
        while(!pila.empty()){ // comprueba si está vacío por toda la lista Stack
        
            pilaReversa.push(pila.pop());
        }
        System.out.println("Reversa");
        
        System.out.println(pilaReversa);

        System.out.println("Probando");
        
        //pilaReversa.push(pila.pop()); // sin while salta la excepción
        
    }
}
