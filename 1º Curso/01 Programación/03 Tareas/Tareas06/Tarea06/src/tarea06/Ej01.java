package tarea06;
import java.util.Scanner;

/**
 * Ejercicio 1
 * @author Ulises III
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el codigo EAN-13 (13 digitos):");
        String codigoBarras = teclado.nextLine();
        int total = 0;

        // sacar la longitud
        if (codigoBarras.length() <= 13) {

            // calculo del dígito de control
            int digito = 0;
            int resto;
            int digitoCalculado = 0;
            for (int i = 0; i < codigoBarras.length() - 1; i++) {
                digito = Character.getNumericValue(codigoBarras.charAt(i));

                if (i % 2 == 0) {
                    total += digito * 1;
                } else {
                    total += digito * 3;
                }
            }
            // multiplo de 10
            resto = total % 10;
            if (resto == 0) {
                digitoCalculado = 0;
            } else {
                digitoCalculado = 10 - resto;
            }

            int ultimoDigito = 0;
            for (int i = 0; i < codigoBarras.length(); i++) {
                ultimoDigito = Character.getNumericValue(codigoBarras.charAt(i));
            }
            // comparar 
            if (digitoCalculado == ultimoDigito) {
                System.out.println(" El codigo EAN-13 es CORRECTO ");
            } else {
                System.out.println("El codigo EAN-13 es INCORRECTO.");
                System.out.println("Digito de control correcto; " + digitoCalculado);
            }
        }
    }
}
