package ejerciciosud4;

import java.util.Scanner;

/**
 *Ejercicio 24 : Nota media de los alumnos
 * 
 * @author Nicolás 
 */
public class Ej24_notaAlumnos {
    
     public static void main(String[] args) {
       
             String caracter = ""; //solo puede almacenar el primer caracter
    
        int nota = 0;
        double media = 0;
        int veces = 0;
        int suma = 0;

        Scanner reader = new Scanner(System.in);
        while (!caracter.equalsIgnoreCase("N")){
        do {
            System.out.print("Introduce una nota: ");
            nota = reader.nextInt();
            if (nota < 0) {
                System.out.println("Las notas no pueden ser negativas");
                } else if (nota > 10 ) {
                    System.out.println("Las notas no pueden pasar de 10");
                }
         suma += nota;
         veces++;
        } while (nota < 0 || nota > 10);
        System.out.print("Introduce una letra que sea S (continuar) o N (salir): ");
        caracter = reader.next();//darle el valor a cadena
        //caracter = cadena.charAt(0);//darle el valor a caracter, siendo el primero de la variable cadena
        System.out.println("Caracter leido: " + caracter);
        }
        media = suma/veces;
        System.out.println("La nota media es: " + media);
         
        }
    }
    
    

