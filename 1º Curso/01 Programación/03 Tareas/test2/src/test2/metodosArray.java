package test2;

import java.util.*;

public class metodosArray {

	int indice = 0 ;
	int array[];
	int contador= 0 ;
	String respuesta;
	Scanner teclado = new Scanner (System.in);

	
	
	
	private String mostrarArray() {
		for(int numero : array) {
			System.out.println(" valor array " + numero);
		}
		return Arrays.toString(array);
	}
	private void borrarArray () {
		
		if (contador > 1 ) {
			
			array = new int[5];
			contador= 1; 
			System.out.println(" Se han borrado todo los datos ");
		}else {System.out.println("No hay datos que borrar ");}
	}
	
	private void  modificarArray ( int valor  , int nuevoValor) {
		
			String respuesta = "";
		
		
			System.out.println("Vale vamos a modificar los datos");
			System.out.println("Selecciona el indice que quieras cambiar");
			respuesta = teclado.next();
			int valor2 = Integer.parseInt(respuesta);
			this.valor=valor;
			if (array[valor] != 0) {
		
				System.out.println("Indice seleccionado  - " + valor);
				System.out.println("Ahora elige el valor que quieres poner en el indice " + valor);
				
				int nuevoValor = 0;
				String nuevaRespuesta ="";
				nuevaRespuesta = teclado.next();				
				nuevoValor = Integer.parseInt(nuevaRespuesta);
				array[valor] = nuevoValor;
				System.out.println(" el nuevo valor a sido " +nuevoValor);
				//System.out.println("nuevo valor en el array " + array[valor] + " con el valor " + nuevoValor);
				System.out.println("Nuevo valor en el indice " + valor +" - valor array - " + array[valor]);
				
			}else {
				System.out.println("Has seleccionado el indice " + valor + " - array - " + array[valor]);
				System.out.println("No hay valores que modificar , el array está vacio" + Arrays.toString(array) );
			}
			
		}
		
	}
	
	private void añadirArray(String respuestaParam) {
		String respuesta = "";
		this.respuesta = respuestaParam;
		
		if (1 < contador) {
			System.out.println("Ya hay datos en el array ");
			
			for ( int numero : array) {
				System.out.println("prueba forEacht -> "  + contador + " - "+ array[indice]);
				System.out.println("Prueba formEacht 2 " + numero );
				//contador++;
			}
		}else {
			
		System.out.println("Perfecto vamos a introducir datos");
	
		for( int i = 0; i < array.length ; i++) {
			
		
			int valor = Integer.parseInt(respuesta);
			array [i] = valor ; 
			
			System.out.println("Perfecto , el valor introducido a sido " + valor + "\n");
			System.out.println("El resultado a sido ;" + " Indice " + i + " - " + array[i]);
			System.out.println("El resultado total es " + Arrays.toString(array));
			contador++;
			
		}
	}
		
		
		
		
		
		
	}
}
