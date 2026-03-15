package examen02.motor;
/**
 * Examen simulacro
 * @author Ulises III
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        motorCont coche = new motorCont();
        motor nuevoMotor = new motor();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Marca del coche: ");
        coche.setMarca(teclado.nextLine());
        System.out.print("Modelo del coche: ");
        coche.setModelo(teclado.nextLine());
        System.out.print("Caballos del motor: ");
        nuevoMotor.setCaballos(teclado.nextInt());
        System.out.print("Consumo del motor: ");
        nuevoMotor.setConsumo(teclado.nextDouble());

        coche.setMotor(nuevoMotor);

        System.out.println();

    
    }
}
