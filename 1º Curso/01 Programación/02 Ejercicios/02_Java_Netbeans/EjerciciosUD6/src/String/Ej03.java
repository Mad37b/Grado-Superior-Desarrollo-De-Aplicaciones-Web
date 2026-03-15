package String;
import java.util.Scanner;
/**
 * @author Ulises III
 */
public class Ej03 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String texto ;
        String palabra;
        int contador=0;
        char letra ;
        
        texto = teclado.nextLine();
       
        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);
            contador++;
            System.out.print(" " + letra );
          }
            palabra = texto;
            System.out.println("");
            System.out.println("Al reves:");
        for (int i = contador-1; i >= 0; i--) {
            System.out.print(" "+palabra.charAt(i));
        }
        
            System.out.println("");
        }
    }