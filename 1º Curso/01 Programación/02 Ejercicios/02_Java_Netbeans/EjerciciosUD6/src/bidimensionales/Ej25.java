package bidimensionales;

/**
 * Ejercicio 25
 * @author Ulises III
 */
public class Ej25 {
    public static void main(String[] args) {
        int array[][] = new int [10][10];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j]=1;
                    System.out.print(array[i][j]);
                }else{
                    array[i][j]=0;
              System.out.print(array[i][j]);} // o con System.out.print(" ");
            }
            System.out.println("");
        }
      
    }
}
