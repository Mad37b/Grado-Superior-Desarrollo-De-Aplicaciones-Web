package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 37
 * @author Ulises III
 */
public class Ej37_numeroCapicua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido al programa" + " \n pide un numero Capicua");
        int numeroC = teclado.nextInt();
        int copiaC = numeroC;
        int invertido = 0;
        int resto = 0 ;
        // calculo del numero Capicúa
              while (numeroC > 0) {
            if ( numeroC <1){
                
                System.out.println(" El numero introducido es negativo" + numeroC);   
            }
            
            resto = numeroC % 10;
            invertido = invertido * 10 + resto;
            numeroC= numeroC / 10;
            
                 }
            
            if ( invertido == copiaC){
                System.out.println("El numero " + invertido + " es un numero Capicua");   
            }else{
                
                System.out.println("El numero" + invertido +"no es capicua");
                
            }
            
         
    }
}
