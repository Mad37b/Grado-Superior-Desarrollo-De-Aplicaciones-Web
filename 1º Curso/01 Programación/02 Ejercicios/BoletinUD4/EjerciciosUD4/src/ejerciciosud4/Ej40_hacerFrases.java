package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 40 
 * @author Ulises III
 */
public class Ej40_hacerFrases {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner( System.in);
        System.out.println("Pon una frase");   
        String frase =teclado.nextLine(); // 1. Obligatorio si 
        String nuevaFrase = "";
       if ( !frase.matches(".*\\s.*")){
          frase = frase.toLowerCase();
           for (int i = frase.length()-1; i >= 0; i--) { // 2. Descendiente para invertir
               nuevaFrase += frase.charAt(i);
           }
           
           System.out.println("nueva frase :" + nuevaFrase);
       }else{ System.err.println(" la frase tiene espacios");}
           
               if ( frase.equals(nuevaFrase)){
                   System.out.println("La frase es palindromo");
               }
    }
    
}
