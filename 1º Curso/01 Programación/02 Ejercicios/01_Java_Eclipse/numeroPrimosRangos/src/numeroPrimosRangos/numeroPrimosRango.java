package numeroPrimosRangos;

public class numeroPrimosRango {

	
	
	
	
	public static void main (String [] arg) {
		
		int numImpar1=0;
		int numImpar2=5;
		boolean esPrimo;
		// buscar numeros primos del 1 al 100
		
			for ( int i = 3; i< 100; i+=2) {
				 esPrimo=true;
				 if (i%2 ==1){
					numImpar1=i;
					 System.out.print("numero impar" + numImpar1);
					
					 
					 
					 for ( int j = 2; j < i; j++) {
						 if ( i % j == 0 ) {
							 esPrimo=false;
							break;
						 }
						 
						
					 }
					System.out.println();
					 if(esPrimo) {
						 System.out.print("numero Primo"+i +",");
						 
					 }
					 
				
					 
				}
			
			}
			
			// numero primo 1
		
		
			// numero primo 2
		
		
			// compara o valida si es primo los dos numeros
		
			// imprime en lista los numeros primos 
		
	}
	
	
}
