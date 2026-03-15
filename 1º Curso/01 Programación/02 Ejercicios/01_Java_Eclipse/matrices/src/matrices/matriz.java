package matrices;

import java.util.Random;

public class matriz {

	
	public static void main (String [] arg) {
		
		// separar las funciones de la matriz , llenar, imprimir, suma diagonal - 
		
		// Variables
		
		int fila = 5;
		int columna = 5 ; 
		int matriz [][] = new int [fila][columna];
		
		int suma = 0 ; 
		int j = 0 ;
		
		// numero Aleatorio 
		
		Random random = new Random ();
		
		
		System.out.println("Tabla");
		for ( int i = 0 ; i < fila ; i++  ) {
			
			for (j = 0 ; j < columna ; j ++) {
			
				matriz[i][j] += random.nextInt(10);
				
				if ( i == j ) {
					suma += matriz [i][j];
					//System.out.print(""+ matriz[i][j]+ "-");
					
					System.out.print(" Rojo ");
					// o suma de los numeros en diagonal , fuera imagino
				}else {System.out.print(" "+ matriz[i][j]+ " -");	}
				
			}
			
			System.out.println("");
		}
		
	}
	
}
