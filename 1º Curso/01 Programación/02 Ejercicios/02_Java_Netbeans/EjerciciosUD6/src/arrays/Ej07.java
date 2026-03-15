package arrays;
import java.util.Scanner;
import java.util.Random;
/**
 * @author Ulises III
 */
/**
 * Asignarle a un vector de 50 elementos valores aleatorios comprendidos entre 1 y 40. Escribir el contenido
del vector. A continuación, comprobar si un número leído por teclado está en el vector, escribiendo la
posición que ocupa. En el caso de que el número esté repetido, tiene que visualizarse un mensaje con el
formato:**/
public class Ej07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int array []= new int [50];
        Random aleatorio = new Random();
        int veces = 0;
        int n ;
        
        // asignar numero aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] =  aleatorio.nextInt(40)+1;
        }
        
        System.out.println("Visualizar:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("posicion " + i + " - " + array[i]);
        }
        
        System.out.println("Comparar con n ");
        n = teclado.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                System.out.println("El numero "+ n +" esta en la posicion "+ i +" y vale: " + array[i]);
                veces ++;
            }
        }
        // es mejor práctica no imprimir de forma indefinida el else que hacía en la última práctica
        System.out.println("Resultado");
        // ver las repeticiones si las detectan 
        if( veces == 0 ){
                System.out.println("En la posicion "+veces+" El numero " + n + " no esta en el vector");
            
        }else if (veces > 1){
                System.out.println(" el número "+n+" está repetido y aparece" + veces + " veces");
        }else {
            System.out.println(" El numero" + n + " solo aparece una sola vez");   
        }
    }
}