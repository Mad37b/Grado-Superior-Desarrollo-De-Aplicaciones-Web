package OrdenacionColecciones12.Atleta;

import java.util.Comparator;

/**
 * Ejercicio 12
 *
 * @author Ulises III
 */
public class OrdenarAtletaPorPeso implements Comparator<Atleta> {

    @Override
    public int compare(Atleta e1, Atleta e2) {
        if (e1.getEdad() == e2.getEdad()) {
            return Double.compare(e1.getPeso(), e2.getPeso()); // ascendente
        }

        return Integer.compare(e2.getEdad(), e1.getEdad()); 
    }

}
