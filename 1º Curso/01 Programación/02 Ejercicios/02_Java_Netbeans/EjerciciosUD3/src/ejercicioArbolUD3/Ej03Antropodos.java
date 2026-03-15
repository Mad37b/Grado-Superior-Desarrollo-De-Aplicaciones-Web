package ejercicioArbolUD3;
/**
 * enlace : https://aceptaelreto.com/problem/statement.php?id=293
 * @author Ulises III
 */
import java.util.Scanner;
public class Ej03Antropodos {

    public static void main(String[] args) {
         
    Scanner teclado = new Scanner (System.in);
    int insectos;
    int aracnidos;
    int crustaceos;
    int escolopendras;
    int anillos;
    int total;
    int nCasos = teclado.nextInt();
    
        for (int i = 0; i < nCasos; i++) {
        insectos=teclado.nextInt();
        aracnidos=teclado.nextInt();
        crustaceos=teclado.nextInt();
        escolopendras=teclado.nextInt();
        anillos = teclado.nextInt();
            
            total = (insectos * 6) + (aracnidos*8) + (crustaceos * 10) + (escolopendras * anillos*2);
             System.out.println(total);
        }
    }
}