package Ej11;

import Ej10.*;
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
    
    portatil1.setMarca("Samsung");
    portatil1.setCpu("Intel");
    portatil1.setRam(32);
    portatil1.setHD(500);
    portatil1.setEsUSBC(true);
    
    //
    portatil1.getMarca();
    portatil1.getCpu();
    portatil1.getRam();
    portatil1.getHD();;
    portatil1.isEsUSBC();
    
    portatil1.visualizar();
    //
    System.out.println("-----");
    System.out.println("Ahora para el segundo portatil"+"\n"+"-----");
    portatil2.setMarca("Lenovo");
    portatil2.setCpu("AMD");
    portatil2.setRam(64);
    portatil2.setHD(1000);
    portatil2.setEsUSBC(false);
    
    portatil2.getMarca();
    portatil2.getCpu();
    portatil2.getRam();
    portatil2.getHD();;
    portatil2.isEsUSBC();
    
    portatil2.visualizar();
 

    
    }
    
}