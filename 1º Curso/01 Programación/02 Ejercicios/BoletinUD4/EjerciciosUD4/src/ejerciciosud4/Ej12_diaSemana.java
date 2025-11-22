/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 12
 * @author Ulises III
 */
public class Ej12_diaSemana {
    
    public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
    
    String diaSemana= teclado.nextLine();
    
    switch (diaSemana){
    
        case "lunes":System.out.println("Lunes");break;
    
        case "Martes":System.out.println("Martes");break;
    
        case "Miercoles":System.out.println("Miercoles");break;
    
        case "Jueves":System.out.println("Jueves");break;
    
        case "Viernes":System.out.println("Viernes");break;
    
        case "Sabado":System.out.println("Sabado");break;
        
        case "Domingo":System.out.println("Domingo");break;
    
}
    }
}
