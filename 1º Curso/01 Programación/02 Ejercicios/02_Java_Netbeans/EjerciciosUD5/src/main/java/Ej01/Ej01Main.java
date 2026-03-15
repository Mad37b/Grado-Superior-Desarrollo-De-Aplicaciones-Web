
package Ej01;

/**
 * Ejercicio01-Rectángulo
 * @author Ulises III
 */
public class Ej01Main {
    
    public static void main(String[] args) {
     Ej01Rectangulo rectangulo1 = new  Ej01Rectangulo();
     Ej01Rectangulo rectangulo2 = new  Ej01Rectangulo();


     rectangulo1.setAlto(5.5);
     rectangulo1.setLargo(6.5);

     System.out.println("superficie: " + rectangulo1.superficie());
       
     rectangulo1.visualiza();
     System.out.println("\n");
     //jugamos con rectangulo2
     rectangulo2.setAlto(0.34);
     rectangulo2.setLargo(1.5);

     System.out.println("Datos del objeto rectangulo2:");
     rectangulo2.visualiza(); 

    }
}
