package Clases4;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Nivel : Intermedio Ejercicio 4
 * @author Ulises III
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Socio cliente[] = new Socio[5];
        Gimnasio gym1 = new Gimnasio(2,cliente);
        
        gym1.setSocio(cliente);
        
        // 2. 
        System.out.println("Establecer 3 socios con edades distintas");
        for (int i = 0; i < cliente.length; i++) {
            cliente [i] = new Socio (); // evita y quita los null
            
            cliente[i].setEdad(teclado.nextInt());
        }
        // 3.
        for (int i = 0; i <  cliente.length; i++) {
            
            System.out.println(cliente[i].getEdad());
            
        }
        
        System.out.println(Arrays.toString(cliente));
    }
}
