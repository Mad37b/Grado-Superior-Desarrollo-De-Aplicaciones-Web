package arrays;
import java.util.Random;
/**
 * Ejercicio 17 - Se puede hacer más limpio con menos lineas
 * @author Ulises III
 */
public class Ej16 {
    public static void main(String[] args) {
        Random aleatorio= new Random();
        int array[] = new int [50];
        double aux[]=  new double[4];
        int numeroAleatorio;
        System.out.println("Lista de vectores:");
        for (int i = 0; i < array.length; i++) {
            numeroAleatorio = aleatorio.nextInt(80-20+1)+20;
            array[i]= numeroAleatorio;
           
            if (i == array.length-1) {
                System.out.print(array[i] + ".");
            }else{
            System.out.print(array[i] + ", ");
            }
          
        }
        System.out.println("");
        //1.- Conseguir el numero más pequeño del vector
            int numMinimo = 81;
            int numMax=19;
            for (int i = 0; i < array.length; i++) {
                if (array[i]<numMinimo) {
                    numMinimo = array[i];
                }
        }
            System.out.println("numero Minimo: "+numMinimo);
        //2.- Elemento mayor de numeros
        for (int i = 0; i < array.length; i++) {
             if (array[i]>numMax) {
                    numMax = array[i];
                }
            
            
        }
        System.out.println("numero Maximo: "+numMax);
        //3.- Suma de todos los elementos de numeros 
        
        int numSum=0;
        for (int i = 0; i < array.length; i++) {
            numSum+=array[i];
        }
        System.out.println("numero Suma: "+numSum);
        //4.-Media aritmetica de todos los elementos de numero
        
        int media = numSum / array.length;
        System.out.println("media:" + media);
        // guardar en aux
        aux[0] = numMinimo;
        aux[1] = numMax;
        aux[2] = numSum;
        aux[3] = media;
        // salida 
        
        System.out.println("Salida:");
        System.out.println("Aux numero minimo :"+aux[0]);
        System.out.println("Aux numero maximo :"+aux[1]);
        System.out.println("Aux suma :"+aux[2]);
        System.out.println("Aux media:"+aux[3]);
    }
}
