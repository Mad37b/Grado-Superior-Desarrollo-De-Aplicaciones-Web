package bidimensionales;

import java.util.Random;

/**
 * Ejercicio 23
 * @author Ulises III
 */
public class Ej23 {
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
        int menor =array[0][0] ;
        int mayor = array[0][0];
        
        int filaMenor=0;
        int filaMayor=0;
        
        int columnaMayor=0;
        int columnaMenor=0;
        
              System.out.println("Calculo del elemento más pequeño");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                             if (array[i][j] <= menor) {
                                  menor= array[i][j];
                                  
                                  filaMenor =i;
                                  columnaMenor= j;
                        }
                  }
              }
                 System.out.println("Calculo del elemento más pequeño");
                 System.out.println("menor " + menor+ " fila "+filaMenor +" columna " + columnaMenor);
                 System.out.println("Calculo del elemento más grande");
                 
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                             if (array[i][j] > mayor) {
                                  mayor= array[i][j];
                                  filaMayor = i;
                                  columnaMayor = j;
                        }
                  }
              }
                         System.out.println("mayor " + mayor + " fila "+filaMayor +" columna " + columnaMayor);
    }
}
