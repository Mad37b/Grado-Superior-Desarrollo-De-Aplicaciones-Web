
/**
 * enlace : https://aceptaelreto.com/problem/statement.php?id=158
 * @author Ulises III
 */
import java.util.Scanner;
public class mario2 {
    public static void main(String[] args) {
          Scanner teclado = new Scanner (System.in);
          int casos=teclado.nextInt();
          int altura;
          int muros ;
          int aux;

          int subida=0;
          int bajada=0;

                for (int i = 0; i < casos; i++) {
                muros = teclado.nextInt();
                aux= teclado.nextInt();
                    for (int j = 0; j < muros-1; j++) {

                        altura = teclado.nextInt();
                 
                        if (aux > altura) {
                          bajada++;
                          
                        }
                        else if (aux < altura) {
                         subida++;
                        }
                    
                        aux=altura;   
                    }  
             System.out.println(subida +" "+ bajada);
             bajada = 0;
             subida= 0 ;
            }
         }         
    }