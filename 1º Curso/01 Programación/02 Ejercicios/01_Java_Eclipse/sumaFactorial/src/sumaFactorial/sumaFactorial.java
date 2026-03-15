package sumaFactorial;

public class sumaFactorial {

	public static void main (String[] arg) {
		
		int numeroFactorial = 1;
		int n = 5;
	
		//( n! = n2* i )
		
		
		while (n> 1 ) {
			
			numeroFactorial = n * numeroFactorial;
			System.out.println("El resultado factorial a sido " + numeroFactorial);
			n--;
		}
		
	}
	
	
}
