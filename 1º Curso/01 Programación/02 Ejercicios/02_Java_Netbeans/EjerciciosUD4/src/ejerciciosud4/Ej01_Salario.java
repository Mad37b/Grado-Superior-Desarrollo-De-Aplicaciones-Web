package ejerciciosud4;

/**
 *
 * @author Ulises III
 */
import java.util.Scanner;
public class Ej01_Salario {

    /**
     * Apartado 1
     * 
     * @param args the command line arguments
     */
    
    /**
     * 1. Escribir un programa que calcule lo que tiene que cobrar un empleado sabiendo que se le tiene que aplicar
     * al sueldo una retención del 20%**/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner ( System.in);
        double numero; 
        double retencionPorcentaje= 0.2;
        
        System.out.println("Bienvenido al programa , inserte su sueldo");   
        
       double valor = teclado.nextDouble();
       double total = valor * retencionPorcentaje;
        System.out.println("");
        System.out.println("El valor que hemos conseguido con el 20% de retencion a sido " + total+"€");
        System.out.println("el suelto neto es de :" + (valor-total)+"€");
    }
    
}
