package arrays;
import java.util.Scanner;
/**
 * @author Ulises III
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String dni;
        int isDigit;
        char isLetra;
        /**
         *  Verificar si una cadena de texto leída por teclado es un NIF correcto o no. Suponer que los NIFs tienen 8
         * dígitos y a continuación una letra (no importa que sea mayúscula o minúscula).
         * 
         * PISTAS: dos condiciones que debe cumplir el NIF: tener 9 caracteres y que el último sea una letra.
            Comprobado esto, verificar que el resto de caracteres son dígitos.
            Usar el método length() de java.lang.String para conocer el número de caracteres de una cadena de texto.
            Usar el método estático isLetter(char c) de java.lang.Character para comprobar que un carácter es una
            letra.
            Usar el método estático isDigit(char c) de java.lang.Character para comprobar que un carácter es un dígito.
            Usar el método substring(int inicio, int fin) de java.lang.String para obtener la parte numérica del nif **/
        
        // preguntamos el dni 
        
        dni= teclado.next();
         char letra = dni.charAt(8);
         String n = dni.substring(0,8);
        if (dni.length() == 9 &&  Character.isLetter(letra) ) { // Clase Character de java
            System.out.println("ok");
            
            for (int i = 0; i < n.length(); i++) {
                if (Character.isDigit(n.charAt(i))) {
                    System.out.println(i + "- ok digitos :"+ n.charAt(i));
                }else{System.out.println(i + "- No digitos :" + n.charAt(i));}
            }
        }
        
        
    }
 
}
