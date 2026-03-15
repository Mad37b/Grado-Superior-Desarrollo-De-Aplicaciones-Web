package examen02s.vehiculo;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculo coche[] = new Vehiculo[3];
        String matricula = "";
        String marca = "";
        double kilometros = 0.00;
        Vehiculo turismo = new Vehiculo(matricula, marca, kilometros);
        //

        for (int i = 0; i < coche.length; i++) {
            System.out.println(" ");
            System.out.println("matricula");
            matricula = teclado.nextLine();
            System.out.println("marca");
            marca = teclado.nextLine();
            System.out.println("kilometro");
            kilometros = teclado.nextDouble();
            teclado.nextLine();
            coche[i] = new Vehiculo(matricula, marca, kilometros);
        }
        Vehiculo kilometroMayor = coche[0]; // asumimos que el primer coche es el más grande
        for (int i = 0; i < coche.length; i++) {

            if (coche[i].getKilometros() > kilometroMayor.getKilometros()) {

               kilometroMayor = coche[i]; // <--- ¡ESTO ES LO QUE ACTUALIZA AL GANADOR! Cada vez que comparo de menor o mayor , actualizo
               
            }

        }
        System.out.println("El coche con más kilometros ha sido " + kilometroMayor.getMarca());
    }
}
