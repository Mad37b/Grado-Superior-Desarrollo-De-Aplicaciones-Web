package arrays;
import java.util.Random;
/**
 *  15 : vectores aleatorios y cálculos de pares/impares.//Revisar
 * @author Ulises III
 */
public class Ej15 {
    public static void main(String[] args) {
        int lista []=new int[25];
        double auxi []=new double[4]; // pos0: nPares pos1: media impar pos2:impar pos3: entre 1 y los numeros pequeños de par
        Random nAleatorio = new Random ();
        int valorAleatorio;
        System.out.println("Mostrar el vector lista:");
        for (int i = 0; i < lista.length; i++) {
            valorAleatorio = nAleatorio.nextInt(50-25+1) + 25;
            lista[i] = valorAleatorio;
            System.out.print(lista[i]+", ");
        }
        System.out.println("");
        //Array Aux
        System.out.println("Resultados");
        int par=0;
        int impar=0;
        int mediaImpar=0;
        int min=51;
        int parPequeño=0;
        int pequeno=0;
        int sumaImpar=0;
        for (int i = 0; i < lista.length; i++) {
            
            if (lista[i] % 2 ==0) {//par
                auxi[0]++;
               
            }
            if (lista[i] % 2 ==1) {//impar
                auxi[1] ++;
                impar=(int)auxi[1];
                sumaImpar+=lista[i];
                
            }
              if (lista[i] % 2 ==0) {//suma par pequeño

                auxi[3] ++;
                
                  if (lista[i]<min) {
                      min = lista[i];
                      
                  }
            } 
        }
        parPequeño = min;
        int sumaAcomulador=0;
        for (int i = 0; i < min; i++) {
            sumaAcomulador+=i;
        }
        
        
        par  = (int)auxi[0];
        auxi[2]=sumaImpar/(int)auxi[1]; // numero / veces
        mediaImpar = (int)auxi[2];
        pequeno=(int)auxi[3];
        
        System.out.println("pos0 :" +par +" veces");
        System.out.println("pos1 :" +impar +" veces" );
        System.out.println("pos2 :" +mediaImpar + " media" );
        System.out.println("pos3 :" + pequeno +" -suma par pequeno");
    }
}