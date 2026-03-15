package String;

/**
 * Ejercicio 4 : Formateo en Strings
 * @author Ulises III
 */
public class Ej04 {
    public static void main(String[] args) {
        
        String producto = "Ratón";
        double precio = 15.5;
                                // %s -> String // %'numero de espacios's
                                // %d -> Enteros (Int)
                                // %f -> números decimales (float/double) // %f0'numero de ceros','numero de decimales'
        String formato= String.format("Producto:[%10s] - Precio: %08.2f", producto,precio) ;
        
        System.out.println(formato);
        
        
    }
    
}
