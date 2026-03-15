package numeroPiramide;

import java.util.Random;

public class numeroPiramide {

	public static void main (String [] arg) {
		
		int matriz [] = new int [5];
		
		Random random = new Random() ; 
		
		int numeroAleatorio = random.nextInt(50) + 1 ; 
		
		int nfila = 5 ;
	System.out.print("    ");
		for (int i = 0 ; i < nfila ; i++) {


			if ( i == 3) {
System.out.print("   - "+numeroAleatorio+" -");
			}

		}
		System.out.println();
		System.out.print("    ");
		System.out.print("");
		/////////// 2º Fila 
		for (int i = 2 ; i < nfila ; i++) {
			
			numeroAleatorio = random.nextInt(50)+i+1;
			
			System.out.print(numeroAleatorio+" - ");
			if ( i == 1 ) {
		
			
			
				
			}


		}
/////////// 3º Fila 
System.out.println("");
System.out.print(" - ");
		for (int i = 1 ; i < nfila ; i++) {
			
			numeroAleatorio = random.nextInt(50)+i+1;
			
			System.out.print(numeroAleatorio+" - ");
			if ( i == 1 ) {
		
			
			
				
			}
		
		}
		//System.out.print(" - ");
		System.out.println("");
		for (int i = 0 ; i < nfila ; i++) {
			
			numeroAleatorio = random.nextInt(50)+i+1;
			
			System.out.print(numeroAleatorio+" - ");
			if ( i == 1 ) {
		
			
			
				
			}
		
		}
		
	}
	
	
}
