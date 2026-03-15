package String;

/**
 *
 * @author Ulises III
 */
public class Ej01 {
    public static void main(String[] args) {
        
        String cadena = "4521:Monitor LG 24:150.99"; //formato ID_PRODUCTO:NOMBRE:PRECIO.
        
       //int nombre = cadena.indexOf("Monitor");  Está en la posicion 5
        
       String nombres = cadena.substring(5,12);
        
        System.out.println(nombres);
        
        
    }
    
}
