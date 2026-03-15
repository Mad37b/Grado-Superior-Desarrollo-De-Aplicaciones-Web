package bidimensionales;

/**
 * Ejercicio 30
 *
 * @author Ulises III
 */
public class Ej30 {

    public static void main(String[] args) {

        int[][] tablero = { // negro 1 , blanco 0
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0}
        };
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j]==1) {
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                
            }
            System.out.println(" ");
        }
        
        
    }
}
