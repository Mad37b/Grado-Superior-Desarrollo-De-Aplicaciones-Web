package ArrayList01;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *  Ejercicio 2 : Repaso con numeros ( basico )
 * @author Ulises III
 */
public class Ej02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(22, 15, 28, 19, 34, 20, 25));
        int suma=0;
       double promedio=0;
        for (int i = 0; i < lista.size(); i++) {
            suma+=lista.get(i);
            promedio= suma /lista.size(); // si pongo double en la suma , sale muchas décimas
             System.out.println("suma total:" + suma);
        }
       System.out.println("promedio:" + promedio);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > 25) {
                System.out.println("¡Alerta! Temperatura alta detectada " + lista.get(i));
            }
        }
        System.out.println(" ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)< 25 ) {
                System.out.println("¡Bajo! Temperatura baja detectada " + lista.get(i));
            }
        }
        if (lista.contains(15)) {
            lista.remove(Integer.valueOf(15)); // asi lo interpreta mejor java en vez de poner solo 15 , para que no rompa
        }
    }
}
