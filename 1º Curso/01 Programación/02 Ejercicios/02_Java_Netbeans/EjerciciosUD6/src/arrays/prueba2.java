package arrays;

import java.util.Arrays;

/**
 *
 * @author Ulises III
 */
public class prueba2 {
    
    public static void main(String[] args) {
        int[] valores = {4, 21, 6, 33, 10, 2, 50, 17};   
        int numero=0;
        int mayor;
        int veces=0;
        //Crea un nuevo array que contenga solo los números mayores que 15.
        
        for (int i = 0; i < valores.length; i++) {
             numero = valores[i];
            if (numero > 15 ) {
               // aqui no puedo asignar mayores
                 veces++;
            }
        }
        
        // donde debo asignar los valores de mayores
        
        int mayores[] =new int [veces];
        int j =0;
        System.out.println("Numeros mayores que 15 ");
        for (int i = 0; i < valores.length; i++) {
                if (valores[i] >= 15){
                     mayores[j] = valores[i];
                       if (j == mayores.length-1) {
                System.out.print(mayores[j] + " . ");
            }else{
                System.out.print(mayores[j] + " - ");
            }
                     j++;
                }
        }
        Arrays.sort(mayores);
        System.out.println("Numeros Mayores ordenados");
        for (int i = 0; i < mayores.length; i++) {
            
            if (i == mayores.length-1) {
                System.out.print(mayores[i] + " . ");
            }else{
                System.out.print(mayores[i] + " - ");
            }

        }
        System.out.println("resultado de restar 5");
        
        int resta [] = new int [j];
    }
}