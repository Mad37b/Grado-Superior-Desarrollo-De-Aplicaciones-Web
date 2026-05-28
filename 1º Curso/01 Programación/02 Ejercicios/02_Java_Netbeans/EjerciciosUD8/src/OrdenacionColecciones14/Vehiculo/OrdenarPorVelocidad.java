package OrdenacionColecciones14.Vehiculo;

import java.util.Comparator;

/**
 * Ejercicio 14
 * @author Ulises III
 */
public class OrdenarPorVelocidad implements Comparator<Coche> {

    @Override
    public int compare(Coche c1, Coche c2) {
        int velocidad1 = c1.getVelocidad();
        int velocidad2 = c2.getVelocidad();
        int mayor = velocidad1 - velocidad2; // Devuelve un entero positivo si es mayor velocidad 1 a velocidad2
        // return Integer.compare(velocidad1, velocidad2);
        return mayor;
    }
}