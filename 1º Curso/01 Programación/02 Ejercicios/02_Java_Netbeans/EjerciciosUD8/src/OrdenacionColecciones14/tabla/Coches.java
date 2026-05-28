package OrdenacionColecciones14.tabla;

/**
 * Ejercicio 14 Main
 *
 * @author Ulises III
 */
import OrdenacionColecciones14.tabla.*;
import java.util.*;
import OrdenacionColecciones14.Vehiculo.*;

public class Coches {

    public static void main(String[] args) {
        Coche[][] objCoches = new Coche[5][5];
        Random aleatorio = new Random();
        ArrayList<Coche> arrSubirMarcha = new ArrayList<>();
        ArrayList<Coche> arrBajarMarcha = new ArrayList<>();

        // 1. llenar Objeto
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                int randVel = aleatorio.nextInt(111) + 10;
                int randMarcha = aleatorio.nextInt(6 + 1);// Incluye el numero aleatorio 0
                objCoches[i][j] = new Coche(randVel, randMarcha);
            }
        }

        // 2. Mostrar valores de la tabla
        System.out.println("Valores de la tabla:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("vel: " + objCoches[i][j].getVelocidad() + " Km/H" + " - marcha: " + objCoches[i][j].getMarcha() + ", " + " || ");
                if (objCoches[i][j].getVelocidad() > 60) {
                    arrSubirMarcha.add(objCoches[i][j]);
                } else if (objCoches[i][j].getVelocidad() <= 40) {
                    arrBajarMarcha.add(objCoches[i][j]);
                }
            }
            System.out.println();
        }

        // 3. Las velocidades si están ordenado de menor a mayor sea mayor a 60  o menor de 40 Km\H
        Collections.sort(arrSubirMarcha, new OrdenarPorVelocidad());

        System.out.println();
        System.out.println("Velocidads superiores a 60:");
        for (Coche c : arrSubirMarcha) {
            System.out.print(c.getVelocidad() + "Km/H "+ " - " + c.getMarcha() + " - ,");
        }
        System.out.println();
        System.out.println();

        Collections.sort(arrBajarMarcha, new OrdenarPorVelocidad());

        System.out.println("Velocidades iguales o inferiores a 40:");
        for (Coche c : arrBajarMarcha) {
            System.out.print(c.getVelocidad() + "Km/H" + " - " + c.getMarcha() + " - ,");
        }
        System.out.println(" ");
    }
}
