import java.util.Random;
import java.util.Arrays;

/**
 * 
 * @author Ulises III
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int nAleatorio = 0;
        int matriz[][] = new int[2][10];

        // 1. Rellenar matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                nAleatorio = aleatorio.nextInt(9) + 1;
                matriz[i][j] = nAleatorio;

            }
        }
        // Mostrar matriz 
        for (int i = 0; i < matriz.length; i++) {
            nAleatorio = aleatorio.nextInt(9) + 1;
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");

        }

        //Comparar cuantas veces ha salido el numero 
        //Arrays.sort(matriz);
        int frecuencia = 0;
        int numero = 0;
        boolean esEncontrado = false;

        //3. Resultado 
        if (esEncontrado) {
            frecuencia++;
        } else {
            esEncontrado = false;
        }
        System.out.println(" ");
        System.out.println("--------------------------------\n"
                + "Número Frecuencia\n"
                + "---------------------------------");

        for (int i = 0; i < 20; i++) { // 20 filas 
            numero = 0;
            for (int j = 0; j < 2; j++) {
                numero = matriz[i][j];
            }
            System.out.print(numero + " \t " + frecuencia);
            System.out.println(" ");

        }
    }
}