/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fecha;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;


/**
 * Clases para fechas y formatos de fechas  - nivel Intermedio
 * @author Ulises III
 */
public class introducirFechaFormato {
    public static void main(String[] args) {
       // Formato por defecto ISO : YYYY/MM/DD
        // 1. introducir fecha sin formato 
        Scanner teclado = new Scanner(System.in);
        String fecha = teclado.nextLine(); // Siempre se utiliza String como entrada de datos para una fecha
        //2. Formato de la fecha
        DateTimeFormatter formato =  DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato de fecha en España 
             // 3. define El string con formato 
                 LocalDate fechaF =  LocalDate.parse(fecha,formato); // aqui se aplica el formato con la fecha 
        
        // ahora con el getter de parse , obtenemos la fecha
        
        System.out.println("Fecha ingresada " + fechaF);
        System.out.print(" " + fechaF.getYear());
        System.out.print(" -  " + fechaF.getMonth());
        System.out.print("- " + fechaF.getDayOfMonth() +"\n");
    }
}
