package principal;
import deportes.Deportistab;
import java.util.Random;

/**
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {

        Deportistab atleta[] = new Deportistab[10];

        Random aleatorio = new Random();
        int edadAleatoria = 0;
        int pesoAleatorio = 0; // debo llevar los datos al for 
        double alturaAleatoria = 0;
        int horasAleatorias = 0;
        String arrayNombres[] = {"Juan", "Pedro", "Laura", "Luis", "Jesus", "Diana", "Maria", "Daniel", "Geromo", "Alba"};

        // 1. Entrada de datos para los deportistas
        for (int i = 0; i < 10; i++) {
            atleta[i] = new Deportistab(); // quito los null

        }

        for (int i = 0; i < 10; i++) {
            edadAleatoria = aleatorio.nextInt(40 - 20) + 16;
            //altura
            alturaAleatoria = aleatorio.nextDouble(2.10 - 1.50) + 1.50;

            horasAleatorias = aleatorio.nextInt(20) + 1;

            pesoAleatorio = aleatorio.nextInt(120 - 40) + 40;

            atleta[i].setNombre(arrayNombres[i]);
            atleta[i].setEdad(edadAleatoria);
            atleta[i].setPeso(pesoAleatorio);
            String.format("%02.1f", alturaAleatoria);
            atleta[i].setAltura(alturaAleatoria);
            atleta[i].setHorasEntrenamientoSemanal(horasAleatorias);

        }

        // 2. Salida 
        for (int i = 0; i < atleta.length; i++) {

            System.out.println("---- DEPORTISTA " + (i + 1) + " -----");
            System.out.print("Nombre: " + atleta[i].getNombre() + "\n");
            System.out.print("Edad: " + atleta[i].getEdad() + "\n");
            System.out.println("Peso: " + atleta[i].getPeso() + " Kg");
            System.out.print("Altura: " + String.format("%02.2f", atleta[i].getAltura()) + " m" + "\n");
            System.out.print("Horas de entrenamiento semanal: " + atleta[i].getHorasEntrenamientoSemanal() + "\n");
            System.out.print("Índice de entrenamiento: " + String.format("%02.2f", atleta[i].calcularIndiceRendimiento()) + "\n");
            System.out.print("Clasificación: " + atleta[i].clasificarRendimiento());
            System.out.println(" ");
        }

    }
}