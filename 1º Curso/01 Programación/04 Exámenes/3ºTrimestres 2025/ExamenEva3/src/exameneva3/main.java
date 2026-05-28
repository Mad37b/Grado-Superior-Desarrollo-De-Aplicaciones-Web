package exameneva3;

import java.util.Scanner;

/**
 * Ejercicio 3 : Main de setas
 *
 * @author dawdi : Miguel Ángel Dominguez Llorente
 */
public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SetaComestible nuevaSeta = new SetaComestible("Nicosia", "Lactarius deliciosus", 28);

        System.out.print("Introduce el nombre:");
        String nombre = teclado.nextLine();
        nuevaSeta.setNombre(nombre);
        System.out.print("Introduce la especie:");
        String especie = teclado.nextLine();
        nuevaSeta.setEspecie(especie);
        System.out.print("Introduce el peso:");
        double peso = teclado.nextDouble();
        nuevaSeta.setPeso(peso);
        System.out.println("");

        System.out.println("-- DATOS INICIALES --");
        nuevaSeta.visualizarSeta();
        System.out.println(" ");
        System.out.print("Introduce el nuevo peso:");
        peso = teclado.nextInt();
        nuevaSeta.setPeso(peso);
        System.out.print("Introduce el nuevo nivel de sabor:");
        int nivelSabor = teclado.nextInt();

        nuevaSeta.setNivelSabor(nivelSabor);
        System.out.println(" ");
        System.out.println("-- DATOS MODIFICADOS --");
        nuevaSeta.visualizarSeta();
    }
}
