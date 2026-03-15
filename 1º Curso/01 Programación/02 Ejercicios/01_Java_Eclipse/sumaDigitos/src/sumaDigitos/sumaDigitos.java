package sumaDigitos;

public class sumaDigitos {

public static void main (String [] arg) {
	
	// 4. Suma los dígitos de un numero
	
			// usamos 10 por el sistema decimal 
			
			int numerosDigitos = 1546;
			int suma=0;
			while ( numerosDigitos > 0) {
				
				
				int digito = numerosDigitos % 10 ; 
				
				 suma += digito;
				
				numerosDigitos = numerosDigitos / 10;
				
				System.out.println("Suma de numeros decimales" + numerosDigitos);
			}
			System.out.println("Suma total = " + suma );
}
	
	
}
