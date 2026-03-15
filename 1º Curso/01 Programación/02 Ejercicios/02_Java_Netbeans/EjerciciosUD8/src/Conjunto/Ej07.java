package Conjunto;
import java.util.*;
/**
 * Ejercicio 7
 * @author Ulises III
 */
public class Ej07 {
    public static void main(String[] args) {
        //Set
        TreeSet <Integer> lista = new TreeSet <>();
        Random aleatorio = new Random ();
        
        while(lista.size()<8){
             lista.add(aleatorio.nextInt(10)+1);
        }
           
        
        System.out.println(lista);
    }
}
