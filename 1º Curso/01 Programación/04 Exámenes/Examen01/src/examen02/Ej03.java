package examen02;

import java.util.*;

/**
 * Ejercicio 3 : String en el examen simulacro
 * @author Ulises III
 */
public class Ej03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String correo;
        String patternCorreo = "$[a-zA-Z]@.com|.es";
        
        // convertir todo el nombre a mayusculas y mostrar cuantos caracteres tiene sin espacios
        // verificar el correo para ver si contiene @ y termina en .es o com
        // si el correo no es válido, debe mostrar un mensaje de error pero si es´ válido debe mostrar solo el nombre del usuario, antes del @
        System.out.print("Inserte un nombre:");
        nombre = teclado.nextLine();
        nombre = nombre.replace(" ", ""); // remplazo los espacios por sin espacios
        nombre = nombre.toUpperCase();
        int longitudNombre = nombre.length();
        System.out.print("Inserte un correo:");
        correo = teclado.nextLine();
        if (correo.contains("@") && ( correo.contains(".es") || correo.contains(".com"))) {
            System.out.println("ok");
             //salida
        System.out.println("Nombre:" + nombre + "\n Caracteres sin espacios: "+longitudNombre);
        System.out.println("Correo:" + correo);
        }else{
            System.out.println(" falta algo ");
        }
        
       
        
    }
}