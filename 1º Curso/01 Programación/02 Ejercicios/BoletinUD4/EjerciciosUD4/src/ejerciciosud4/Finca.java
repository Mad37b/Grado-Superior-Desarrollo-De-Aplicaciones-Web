/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 */
public class Finca {
    
    
    /**
     * Apartado 2:
     * 
     * Escribe un programa que calcule el área de una finca rectangular en metros cuadrados, así como su perímetro exterior
     * */
    
    
          public static void main(String[] args) {
              Scanner teclado = new Scanner ( System.in);
        double numero; 
        double retencionPorcentaje= 0.2;
        System.out.println("Bienvenido al programa , Calcule el area de su finca");   
              System.out.println("Inserte el largo en numero reales");
        double largo = teclado.nextDouble();
        System.out.println("Inserte el ancho en numero reales");
        double ancho = teclado.nextDouble();
        
        double area = largo * ancho;
        double perimetro = (largo+largo) + (ancho+ancho);
              System.out.println("El perimetro de la finca es de " + perimetro);
              System.out.println("El area de la finca es de " + area);
              
              
        
    }
}

