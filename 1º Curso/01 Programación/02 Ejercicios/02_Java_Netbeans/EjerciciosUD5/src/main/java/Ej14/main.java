package Ej14;
import java.util.Scanner;
/**
 * Ejercicio 14
 * @author Ulises III
 */
public class main {
        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
            String dato ;
            Cuenta santander = new Cuenta ();
            //
            santander.setTitular("Alfredo");
            santander.setSaldo(1000.00);

            System.out.println("*Bienvenido al banco*"+ "\n");

            while(true){

                System.out.println("¿Que deseas hacer?\n *Visualizar*, \n*Ingresar*,\n *Retirar*,\n finalizar o no" + "\n");
                dato = teclado.nextLine();
              if (dato.equalsIgnoreCase("finalizar")|| dato.equalsIgnoreCase("No")) {
                  System.out.println("Gracias por su visita");
                break;
            } 
              
             if (dato.equalsIgnoreCase("Ingresar")) {
                  santander.ingresar(1000);
                santander.ingresar(50);
                 System.out.println("Has ingresado :" +santander.getSaldo());
                
            }
            if (dato.equalsIgnoreCase("Retirar")) {
                santander.retirar(100);
                santander.retirar(20);
                System.out.println("Has retirado :" + santander.getSaldo());
            }
            if (dato.equalsIgnoreCase("Visualizar")) {
                santander.visualizar();
               break;
            }

        }

    }
}