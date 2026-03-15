package String;

/**
 * Ejercicio 6 : 
 * @author Ulises III
 */
public class Ej06 {

    public static void main(String[] args) {

        String nombre = "Alejandro";
        String apellido = "Perez";
        String fecha = "1995";

        nombre = nombre.substring(0, 3).toLowerCase().trim();
        apellido = apellido.substring(0, 3).toLowerCase().trim();
        fecha = fecha.substring(2, 4).toLowerCase().trim();

        String formato = String.format("%s%s%s", nombre, apellido, fecha);

        System.out.println(formato);

    }

}
