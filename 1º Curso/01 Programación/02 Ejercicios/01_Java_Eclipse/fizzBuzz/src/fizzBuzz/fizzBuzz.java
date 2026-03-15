package fizzBuzz;

public class fizzBuzz {
	
	public static void main (String [] arg) {
		
		
		int contador = 0;
		
		while ( contador < 50 ) {
			contador++;
			if ( contador % 3 == 0) {
				
				System.out.println(contador + " = Fizz");
			} 
			
			if ( contador % 5 == 0 ) {
				
				System.out.println(contador + " = Buzz");
			}
			
			
			if ( contador % 3 == 0 && contador % 5 == 0 ) {
				
				System.out.println(contador + " = FizzBuzz");
			}
			
			
		}
		
		
	}

}
