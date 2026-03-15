/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4.prueba;
import java.util.Scanner;
/**
 * 
 * @author Ulises III
 */
public class sueldo {
    
    
    	public static void main (String [] arg) {
		
		// variables 
		
		Scanner teclado = new Scanner (System.in);
		int sueldo = teclado.nextInt() ;
		// calculo del sueldo 
		double resultadoInicial =(int)  sueldo * 0.2;
                double resultadoFinal = sueldo - resultadoInicial ;
		// resultado 
                
		System.out.println("El sueldo a sido "+sueldo+"\n"+", El resultado del suelo aplicando el 20% sido " + resultadoInicial +
                "resultado inicial = " + resultadoFinal );
		
		
	}
	
    
    
}
