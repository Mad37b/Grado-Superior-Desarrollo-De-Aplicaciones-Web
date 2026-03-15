/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ulises III
 */

import java.util.Scanner;
import java.time.Duration;
public class date {
    
    
    public static void main (String []arg){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una hora ");
        double valor = teclado.nextInt();
         double semanas = valor / (24.0*7);
        System.out.println(" Horas a Semanas " + semanas);
            double dias = valor / 24.0;
        System.out.println("Horas a dias = " + dias);
        double minutos = valor * 60 ;
        System.out.println("Horas a minutos = " + minutos);

    }
}
