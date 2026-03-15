package Conjunto;
import java.util.*;
/**
 * Ejercicio 6
 * @author Ulises III
 */
public class Ej06 {
    public static void main(String[] args) {
        TreeSet<Character> letras = new TreeSet <> ();
        
        String palabras ="sdadagavavara";
        
        for (int i = 0; i < palabras.length(); i++) {
            letras.add(palabras.charAt(i));
        }
        System.out.println(letras);
    }
}
