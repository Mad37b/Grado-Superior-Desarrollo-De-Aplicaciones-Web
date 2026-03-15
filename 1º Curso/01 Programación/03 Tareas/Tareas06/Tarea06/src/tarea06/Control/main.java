package tarea06.Control;
import tarea06.Drones.Dron;
import java.util.Random;

/**
 * Ejercicio 3
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {
        Dron array[][] = new Dron[4][4];

        Dron dron1 = new Dron();
        Random aleatorio = new Random();
        String stringEstado[] = {"Activo", "Averiado", "En Reposo"};
        String estado = "";
        int energia;
        boolean esEstado;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int indice = aleatorio.nextInt(3);
                estado = stringEstado[indice];
                esEstado = aleatorio.nextBoolean(); // true = activo  , false = en reposo
                energia = aleatorio.nextInt(99) + 1;// 0 al 100 

                array[i][j] = new Dron(energia, estado);
            }
        }
        System.out.println("");
        System.out.println("Matriz de drones 4x4");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{"+(i+1)+","+(j+1)+"}");
                System.out.println(array[i][j].toString());
            }
        }
    }
}