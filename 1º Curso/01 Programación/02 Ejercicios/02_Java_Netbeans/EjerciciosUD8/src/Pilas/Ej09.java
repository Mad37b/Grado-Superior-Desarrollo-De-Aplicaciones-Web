package Pilas;
import java.util.*;
/**
 * Ejercicio 9
 * @author Ulises III
 */
public class Ej09 {
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack <>();
        Stack<Integer> pilaReversa = new Stack <>();
        
        pila.add(4);
        pila.add(6);
        pila.add(9);
        System.out.println("Aumenta");
        
        System.out.println(pila);
        while(!pila.empty()){
        
            pilaReversa.push(pila.pop());
        }
        System.out.println("Reversa");
        
        System.out.println(pilaReversa);

        
    }
}
