package test2;
import java.util.*;
public class prueba2 {

	public static void main (String [] args) {
		
		/** Ejercicio 2 : el parseInt en java **/
		
		int num = 1 ; 
		int num2 = 2 ;
		int total = num + num2;
		
		Scanner teclado  = new Scanner(System.in); /** teclado **/
		
		System.out.println("Bienvenido" + "\n");
		System.out.println("Suma de numeros"+ "\n");
		System.out.println("¿Cuanto es 1 + 2 ?"+ "\n");
		
		String respuesta1 = teclado.nextLine();
		int num3 = Integer.parseInt(respuesta1);
		
		if ( total == num3) {
			
			System.out.println("Correcto , 1 + 2 son 3 ");
		}else {
			
			System.out.println(" Ohh ,3" + respuesta1 +" no es el numero correcto para la suma");
		}
	}
	
	
	
	
}
