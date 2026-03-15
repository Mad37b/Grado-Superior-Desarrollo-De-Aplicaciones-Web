package bidimensionales;

/**
 * Ejercicio 26 : averiguar si una matriz es simetríca
 *
 * @author Ulises III
 */
public class Ej26 {

    public static void main(String[] args) {
        int array[][] = new int[10][10];
        boolean esSimetrico = true;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == array[i][j]) {
                    esSimetrico = true;
                }else{
                    esSimetrico = false;
                    break;
                }
            }
        }
        
        if (esSimetrico) {
            System.out.println("La matriz es simétrica.");
        }else{
            System.out.println("La matriz NO es simétrica.");
        }
        
    }
}
