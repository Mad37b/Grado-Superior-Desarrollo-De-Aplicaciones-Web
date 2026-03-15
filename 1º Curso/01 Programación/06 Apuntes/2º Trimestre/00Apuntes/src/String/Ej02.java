package String;

/**
 * Validar correo
 *
 * @author Ulises III
 */
public class Ej02 {

    public static void main(String[] args) {

        // no debe empezar por numero y acabar en @bkprogramacion.es
        boolean esValido = false;
        String correo = "Juan23@bkprogramacion.es";
        String cadena = correo.substring(6, 24);
        if (!Character.isDigit(correo.charAt(0))) {

            esValido = true;
            System.out.println("ok");

            if (correo.endsWith(cadena)) {
                esValido = true;
                System.out.println(correo);
            } else {
                System.out.println("no es válido correo");
            }

        } else {
            System.out.println("No válido , numero encontrado");
            esValido = false;

        }

    }

}