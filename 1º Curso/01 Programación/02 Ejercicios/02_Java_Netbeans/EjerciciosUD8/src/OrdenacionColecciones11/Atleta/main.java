package OrdenacionColecciones11.Atleta;

import OrdenacionColecciones.Atleta.*;
import java.util.*;

/**
 * Ejercicio 11
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        ArrayList<Atleta> listaAtleta = new ArrayList<>(); // de 10 objetos
        String[] nombres = {"Ana", "Luis", "Marta", "Juan", "Elena", "Pedro"};
        String[] nif = {"111A", "222B", "333C", "444D", "555E", "666F"};
        String nombre;
        String dni;
        int edad=0;
        
        for (int i = 0; i < 10; i++) {
            nombre = nombres[aleatorio.nextInt(nombres.length)];
            dni = nif [aleatorio.nextInt(nif.length)];
            edad = aleatorio.nextInt(50)+18;
            listaAtleta.add(new Atleta(nombre,dni,edad));
        }
        for(Atleta lista : listaAtleta){
        
         System.out.println(lista);
        }
    }
}