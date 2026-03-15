package Ej15;

/**
 * Ejercicio 15
 * @author Ulises III
 */
public class main {
    
   
    
    public static void main (String []arg){
       Ecuaciones x1 = new Ecuaciones();
        
        System.out.println("Bienvenido al programa");
        
        
        x1.setCoeficientes(6, -3, -4);
        System.out.println(x1.obtenerSolucion1());
        System.out.println(x1.obtenerSolucion2());
        System.out.println(x1.averiguar());
        System.out.println();
       
        // set
        
        
        
        
    }
}
