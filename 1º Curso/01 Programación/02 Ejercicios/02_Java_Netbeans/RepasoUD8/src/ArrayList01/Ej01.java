package ArrayList01;

import java.util.*;

/**
 * Ejercicio 1 : Repaso de primeros pasos
 *
 * @author Ulises III
 */
public class Ej01 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        // añadir 
        lista.add("Laptop");
        lista.add("Mouse");
        lista.add("Teclado");
        lista.add("Monitor");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
        System.out.println("Tamaño de la lista :" + lista.size());
        lista.add(1, "Scanner");

        lista.set(2, "Mouse Inalámbrico"); // Actualiza el indice 2
        lista.remove("teclado");
        if (lista.contains("Laptop")) {
            System.out.println("Stock de laptops asegurado");
        }
        System.out.println("Resultado");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
        
    }

}
