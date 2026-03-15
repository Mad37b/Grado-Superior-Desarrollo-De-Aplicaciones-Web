package Ej02;
import Ej01.*;
import java.util.Scanner;

/**
 *
 * @author Ulises III
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        Duracion tiempo = new Duracion();
        AbonoTransporte cliente = new AbonoTransporte(25,"TR45","55212114K",tiempo);
        
        // hacerlo 3 veces 
        //int saldo = teclado.nextInt();
        //int id = teclado.nextInt();
        //int dni = teclado.nextInt();
        
        System.out.println("--Bienvenido al Autobus--");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("------Consulto por primera vez el saldo------");
        
           
            
        cliente.consultarAbono();
        
        System.out.println("Vamos a hacer un viaje ");
           // 120 
        System.out.println(cliente.realizarViaje(120));
        cliente.consultarAbono();
        
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        
            // 240
        
        System.out.println("Vamos a hacer el 2º  viaje");
        System.out.println(cliente.realizarViaje(250));
        cliente.consultarAbono();
        
            // 320
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Vamos a hacer el 3º viaje");
        System.out.println(cliente.realizarViaje(90));
        cliente.usarBonoDiario();
        cliente.consultarAbono();
        
    }
}
