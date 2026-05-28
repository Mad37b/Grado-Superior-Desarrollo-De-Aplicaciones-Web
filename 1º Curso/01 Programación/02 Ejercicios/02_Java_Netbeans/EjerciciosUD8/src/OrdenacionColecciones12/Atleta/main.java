package OrdenacionColecciones12.Atleta;

import OrdenacionColecciones11.Atleta.*;
import OrdenacionColecciones.Atleta.*;
import java.util.*;

/**
 * Ejercicio 12
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        ArrayList<Atleta> listaAtleta = new ArrayList<>(); // de 10 objetos
        String[] nombres = {"Ana", "Luis", "Marta", "Juan", "Elena", "Pedro","Lidia","Melisa","Carlos","Tomas"};
        String[] nif = {"111A", "222B", "333C", "444D", "555E", "666F","777G","888I","999J","101K"};
        String nombre;
        String dni;
        int edad=0;
        double peso =0;
        
        for (int i = 0; i < 10; i++) {
            nombre = nombres[aleatorio.nextInt(nombres.length)];
            dni = nif [aleatorio.nextInt(nif.length)];
            edad = aleatorio.nextInt(30)+18;
            peso = aleatorio.nextDouble(25)+50;
            listaAtleta.add(new Atleta(nombre,dni,edad,peso));
        }
        
        Collections.sort(listaAtleta,new OrdenarAtletaPorPeso());
        for(Atleta lista : listaAtleta){
           
         System.out.println(lista);
        }
    }
}