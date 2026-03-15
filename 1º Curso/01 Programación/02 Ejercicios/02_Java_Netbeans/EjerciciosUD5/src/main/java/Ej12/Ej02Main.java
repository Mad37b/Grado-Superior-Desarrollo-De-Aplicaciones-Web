
package Ej12;
import java.util.Scanner;
/**
 * Ejercicio 12
 * @author Ulises III
 */
public class Ej02Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
     Ej02Rectangulo rectangulo1 = new  Ej02Rectangulo();
     Ej02Rectangulo rectangulo2 = new  Ej02Rectangulo();
     
     rectangulo1.setAlto(teclado.nextDouble());
      rectangulo1.setLargo(teclado.nextDouble());
     
     rectangulo1.visualizar();
     System.out.println("");
     
      rectangulo2.setAlto(teclado.nextDouble());
      rectangulo2.setLargo(teclado.nextDouble());
     
     rectangulo2.visualizar();
 

    }
}
