package arrays;
import java.util.Scanner;
/**
 * @author Ulises III
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] arrayLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K','E'};
        int dni;
        int pos; // posicion 
        String letra;
        System.out.println("Bienvenido a mi programa" + "\n" + "Introduce el dni");
        
        dni = teclado.nextInt();
        pos = dni%23;
        //71620506R
        System.out.println("division :" + pos);
        letra = String.valueOf(arrayLetra[pos]);
        System.out.println("Resultados");
        System.out.println( dni+letra );
    }
 
}
