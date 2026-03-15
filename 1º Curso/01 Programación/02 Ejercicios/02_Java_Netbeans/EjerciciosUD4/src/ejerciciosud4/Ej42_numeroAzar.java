
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 42
 * @author Ulises III
 */
public class Ej42_numeroAzar {
    
    public static void main(String[] args) {
        // genero el numero 
        System.out.println("Introduce un numero ");
       Scanner teclado = new Scanner(System.in);
       int numeroSecreto =(int)(Math.random()*10)+1;
       int numero=0; 
       int nIntentos = 0 ;
     
        
        while(numero != numeroSecreto){
            numero = teclado.nextInt();
     
        if (numeroSecreto == numero  ){System.out.println("el numeroSecreto es " +numeroSecreto );}
        if (numeroSecreto < numero ){System.out.println("el numero secreto es mas pequeño que " +  numero);}
        if (numeroSecreto > numero) {System.out.println("el numero secreto es mas grande que " +  numero);}
        if (numeroSecreto != numero){ System.out.println("siguelo intentando, el numero a sido "+ numero);}
            nIntentos++;
    
        }
  
        }
    }