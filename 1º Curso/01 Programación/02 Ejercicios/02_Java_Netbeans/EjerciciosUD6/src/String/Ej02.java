package String;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 */
public class Ej02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        int casos; // gente que no conoce tinin
        String texto;
        
        casos =teclado.nextInt();
        teclado.nextLine();
                 for (int i = 0; i < casos; i++) {
               texto= teclado.nextLine() ;
            
               String nombre = texto.substring(4);
 
             System.out.println("Hola," + nombre);
        }
           
    }   
 }