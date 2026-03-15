package Ej06;

/**
 * Ejercicio 6
 * @author Ulises III
 */
public class main {
    
    public static void main (String[]arg) {
    
    Portatil portatil1 = new Portatil("Samsung","Intel",16,500,true);
    Portatil portatil2 = new Portatil("Lenovo","AMD",32,1000,false);
    
    portatil1.visualizar();
    System.out.println("-----");
    portatil2.visualizar();
    
    }
    
}