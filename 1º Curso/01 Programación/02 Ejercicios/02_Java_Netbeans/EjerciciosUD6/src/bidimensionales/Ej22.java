package bidimensionales;
import java.util.Scanner;
import java.util.Random;
/**
 * Ejercicio 22
 * @author Ulises III
 */
public class Ej22 {
    public static void main(String[] args) {
        
        int array[][] = new int [5][8];
        Random aleatorio = new Random();
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = aleatorio.nextInt(21)+20;
               
            }
        }
          for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(j+1+") "+array[i][j]);
               
            }
        
    }
}
}
