package arrays;
import java.util.*;
/**
 * Ejercicio 17
 * @author Ulises III
 */
public class Ej17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Random aleatorio = new Random();
        int nomAleatorio ;
        int ap1Aleatorio;
        int ap2Aleatorio ;
        String nombre[] = {"Juan", "María", "Carlos", "Lucía", "Diego", "Elena", "Pablo", "Alba", "Jorge", "Nuria"};
        String apellido1[] = {"García", "Rodríguez", "López", "Sánchez", "Pérez", "Gómez", "Martín", "Jiménez", "Ruiz", "Hernández"};
        String apellido2[] = {"Fernández", "Moreno", "Muñoz", "Álvarez", "Romero", "Alonso", "Gutiérrez", "Navarro", "Torres", "Domínguez"};
        String nombreApellido[]= new String [10];
        String personas[] = new  String[5];
        //a
        for (int i = 0; i < 5; i++) {
           nomAleatorio = aleatorio.nextInt(10);
           ap1Aleatorio = aleatorio.nextInt(10);
           ap2Aleatorio = aleatorio.nextInt(10);
           System.out.print(i +1+ ")");
           personas[i]= nombre[nomAleatorio]+" " + apellido1[ap1Aleatorio]+" " + apellido2[ap2Aleatorio];
           System.out.println(personas[i]);
        }
      //b
      // por teclado 
      
      teclado.nextInt();
      
        if (true) {
            
        }
      //c evitar duplicados
    }
}