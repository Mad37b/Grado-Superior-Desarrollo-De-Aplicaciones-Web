package test2;
import java.util.*;
public class prueba {
/**Este es un recordatorio de entrada y salida de datos en java **/
	public static void main (String [] args) {
		System.out.println("hola pedro");
		Scanner teclado  = new Scanner(System.in); /** teclado **/
		String saludo = teclado.nextLine();
		System.out.println(saludo + " ha hecho un saludo"); /** resultado **/
		
		
		/** ejercicio 1 : Entrada y salida por teclado - preguntas **/
		
		System.out.println("¿el color rojo es el color del coche ?");
		/** valores de las variables **/
		String respuestaSi = "1";
		String respuestaNo = "0";
		
		//1.  Entrada por teclado
		
		String respuesta = teclado.nextLine(); 
		// los nuevos valores de las respuesta serán las que entren por teclado
		System.out.println("Si - 1" + "\n");
	
		System.out.println("No - 0" + "\n");
		//respuestaNo = respuesta;
		/** Para comparar cadenas de texto en vez de usar == que se usa en int , usamos .equals**/
		if (respuestaSi.equals("1") ) {
			System.out.println("¡Correcto , el coche es rojo !");
			
		}else {
			System.out.println("Ohh , el color del coche no es " + respuestaNo);
		}
		
	}
}
