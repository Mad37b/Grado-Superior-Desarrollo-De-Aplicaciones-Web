
/**
 *
 * @author Ulises III
 */
public class prueba {
    
    
    /**
     * 
     * 1. Hacer un programa en el que se declare una variable de cada uno de estos tipos: String,
            float, double y boolean. Leer por teclado valores para las variables, excepto para la de tipo
            boolean, a la que se le asignará el valor “verdadero” al declararla. Escribir a continuación la
            siguiente información:
    a) El nombre en mayúsculas.
    b) Los primeros 3 caracteres del nombre.
    c) El resultado de elevar al cubo cada uno de los valores numéricos.
    d) Raíz cuadrada del valor double.
    e) El contenido de la variable boolean.
    * 
    * 
    * 
    * 
    **/

    public static void main (String [] arg){

        String nombre = "juan"; 
        float decimales = 4.41f;
        double reales = 2.21;
        boolean isVerdadero = true;

        // 1. String

        // Poner el nombre en mayusculas 

        System.out.println(nombre.toUpperCase());

        // los 3 primeros caracteres del nombre
         System.out.println(nombre.substring(0, 3));
        // 2. Integer

        // el resultado de elevar al cubo cada uno de los valores numéricos 
        System.out.println(Math.pow(decimales,3));


        // raiz cuadrada del valor double.

        System.out.println(Math.sqrt(reales));


        // 3.Boolean

        // valor de la variable boolean

        System.out.println(isVerdadero);


        }
}