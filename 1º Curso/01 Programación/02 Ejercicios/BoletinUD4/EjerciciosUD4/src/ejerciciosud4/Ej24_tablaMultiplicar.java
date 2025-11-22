/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 * Apartado 24
 * @author Ulises III
 */
public class Ej24_tablaMultiplicar {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa  - inserte un numero");
        Scanner teclado = new Scanner (System.in);
        String respuesta = "Si";
 
        while( !respuesta.equalsIgnoreCase("No")){
              int numero = teclado.nextInt();
              teclado.nextLine(); // salto
            for (int i = 0; i < 11; i++) {
                int total = numero * i;
                System.out.println(numero +" x "+ i +" = "+total);
            }
            System.out.println("");
          
           System.out.println("Quieres seguir multiplicando? Si/No");
           respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("Si")) {
                System.out.println("inserte de nuevo el numero");
            }
         
        }
          
        
    }
}
