/**
 * enlace: https://aceptaelreto.com/problem/statement.php?id=595
 * @author Ulises III
 */
import java.util.Scanner;
public class volumenes {

    
    public static void main(String[] args) {
             Scanner teclado = new Scanner(System.in);
int veces =teclado.nextInt() ;
int nVolumenes ;
int total;
        for (int i = 0; i < veces; i++) {
              nVolumenes = teclado.nextInt();
            while ( nVolumenes < 100 || nVolumenes > 999999){
               nVolumenes = teclado.nextInt();
               
            }
          
         total = (nVolumenes - 100) / 100 + 1;
            System.out.println(total);
        }
    }
}