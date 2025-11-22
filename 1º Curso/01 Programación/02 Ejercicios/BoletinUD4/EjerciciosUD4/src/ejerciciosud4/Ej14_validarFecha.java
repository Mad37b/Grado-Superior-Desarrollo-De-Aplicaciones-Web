/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 *Apartado 14
 * @author Ulises III
 * Hacer un programa con el formato 
 */
public class Ej14_validarFecha {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido a mi programa de fechas ");
        System.out.println("Inserte un día");
        int dia = teclado.nextInt();
        if (dia < 0 && dia <=31){
            System.out.println("El valor es correcto =" + dia);   
        }
        //String valorDia = dia.toString(); 
        System.out.println("Introduce el mes por nombre");
        String mes=teclado.next();
        switch (mes){
            
            case "Enero": mes="Enero";break;
            case "Febrero": mes="Febrero";break;
            case "Marzo": mes="Marzo";break;
            case "Abril": mes="Abril"; break;
            case "Mayo": mes="Mayo";break;
            case "Junio": mes="Junio";break;
            case "Julio": mes="Julio";break;
            case "Agosto": mes="Agosto";break;
            case "Septiembre": mes ="Septiembre";break;
            case "Octubre": mes ="Octubre";break;
            case "Noviembre": mes="Noviembre";break;
            case "Diciembre": mes="Diciembre";break;
            default: System.out.println("Dato no valido ");
    }     
        System.out.println("Introduce el año");
        int año = teclado.nextInt();
        
        if ( año <=1920 && año <= 2025){
            System.out.println("La fecha es valida");   
        }
     
        System.out.println("Fecha");
        System.out.println(" " + dia + "/" + mes + " /" + año);
        
    }
}
