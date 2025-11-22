/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 * Apartado 34
 * @author Ulises III
 */
public class Ej34_piramideRombo {
    
    
       public static void main(String[] args) {
        int n;

           Scanner reader = new Scanner(System.in);

        do {
            System.out.print("Introduce un valor para n: ");
            n = reader.nextInt();

            if (n >= 3 && n <= 15 && n % 2 != 0) { // ← validación
                int centro = (n + 1) / 2;

                for (int i = 1; i <= n; i++) { // ← bucle de filas
                    int distancia = Math.abs(i - centro); //
                    int puntos = (centro - distancia - 1) * 2 + 1; // más cerca del centro, más puntos
                    int espacios = distancia; // para centrar

                    // imprimir espacios
                    for (int j = 0; j < espacios; j++) {
                        System.out.print(" ");
                    }
                       System.out.print("*");
                    // imprimir figura
                    if (puntos == 1) {
                        System.out.print(""); // solo uno en el centro
                    } else {
                        System.out.print("");
                        for (int j = 0; j < puntos-2; j++) {
                            System.out.print(".");
                        }
                        System.out.print("*");
                    }

                    System.out.println(); // salto de línea
                }
            } else {
                System.out.println("El número debe estar entre 3 y 15, y además ser impar.");
            }
        } while (n < 3 || n > 15 || n % 2 == 0);
    }
}
    
    
    
    
    
    
    

