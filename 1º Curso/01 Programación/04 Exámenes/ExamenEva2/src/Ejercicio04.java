import java.util.Scanner ;
/**
 *
 * @author Ulises III
 */
public class Ejercicio04 {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            String texto;
            System.out.println("Ingrese su nombre completo:");
            texto = teclado.nextLine();

            System.out.println("Nombre Completo:" + texto);
            texto.toLowerCase();

            String letraNombre = "";
            String letraApellido = "";
            String letraApellido2 = "";

            texto.split(" ");
            for (int i = 0; i < texto.length(); i++) {

                if (letraApellido.equals("")) {

                }

            }

            String usuario = letraNombre + letraApellido;

            System.out.println("Nombre del Usuario :" + usuario + letraApellido2);

        }
    }