package Ej10;

import Ej08.*;
import java.util.Scanner;
/**
 * Ejercicio 10
 * @author Ulises III
 */
public class main {
    
    public static void main (String[]arg) {
    Scanner teclado = new Scanner(System.in);
    Portatil portatil1 = new Portatil();
    Portatil portatil2 = new Portatil();
    
    // 
    
    portatil1.setMarca(teclado.next());
    portatil1.setCpu(teclado.next());
    portatil1.setRam(teclado.nextInt());
    portatil1.setHD(teclado.nextInt());
    portatil1.setEsUSBC(teclado.nextBoolean());
    
    portatil1.visualizar();
    //
    System.out.println("-----");
    System.out.println("Ahora para el segundo portatil"+"\n");
    portatil2.setMarca(teclado.next());
    portatil2.setCpu(teclado.next());
    portatil2.setRam(teclado.nextInt());
    portatil2.setHD(teclado.nextInt());
    portatil2.setEsUSBC(teclado.nextBoolean());
    
    portatil2.visualizar();
 

    
    }
    
}