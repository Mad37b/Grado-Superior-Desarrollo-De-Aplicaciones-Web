/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fecha;
import java.time.*;
import java.util.Scanner;

/**
 *
 * @author Ulises III
 */
public class introducirFecha {
    public static void main(String[] args) {
       // Formato por defecto ISO : YYYY/MM/DD
        // 1. introducir fecha sin formato 
        Scanner teclado = new Scanner(System.in);
        String fecha = teclado.nextLine();
        LocalDate fechaF =  LocalDate.parse(fecha);
        
        // ahora con el getter de parse , obtenemos la fecha
        
        System.out.println("Fecha ingresada " + fechaF);
        System.out.println("año " + fechaF.getYear());
        System.out.println("mes " + fechaF.getMonthValue());
        System.out.println("dia " + fechaF.getDayOfMonth());
    }
}
